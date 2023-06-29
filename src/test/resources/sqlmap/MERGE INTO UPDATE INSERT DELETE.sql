/*
Oracle Merge(Insert, Update, Delete) 한번에 작업 하는 방법
*/


/* EstenPark_회원정보 */
CREATE TABLE ESP_MBR_INFO
(
    MBR_NO     NUMBER(10)                       NOT NULL, /* 회원번호 */
    MBR_ID     VARCHAR2(30)                     NOT NULL, /* 회원ID */
    MBR_NM     VARCHAR2(100)                    NOT NULL, /* 회원명 */
    MBR_TEL_NO VARCHAR2(15), /* 회원전화번호 */
    REG_USER   VARCHAR2(30) DEFAULT 'EstenPark' NOT NULL, /* 등록사용자 */
    REG_DTTM   DATE         DEFAULT SYSDATE     NOT NULL /* 등록일시 */
)
    STORAGE
(
    BUFFER_POOL DEFAULT
)
    LOGGING
    NOCOMPRESS
    NOCACHE
    NOPARALLEL
    NOROWDEPENDENCIES
    DISABLE ROW MOVEMENT;

COMMENT ON TABLE ESP_MBR_INFO IS 'EstenPark_회원정보|회원 정보 테이블|';

COMMENT ON COLUMN ESP_MBR_INFO.MBR_NO IS '컬럼값|컬럼값||';

COMMENT ON COLUMN ESP_MBR_INFO.MBR_ID IS '회원ID';

COMMENT ON COLUMN ESP_MBR_INFO.MBR_NM IS '회원명';

COMMENT ON COLUMN ESP_MBR_INFO.MBR_TEL_NO IS '회원전화번호';

COMMENT ON COLUMN ESP_MBR_INFO.REG_USER IS '등록사용자|등록사용자||';

COMMENT ON COLUMN ESP_MBR_INFO.REG_DTTM IS '등록일시|등록일시||';

CREATE UNIQUE INDEX ESP_MBR_INFO_PK
    ON ESP_MBR_INFO (
                     MBR_NO ASC
        )
    STORAGE (
    BUFFER_POOL DEFAULT
    )
    NOLOGGING
    NOCOMPRESS
    NOSORT
    NOPARALLEL;

ALTER TABLE ESP_MBR_INFO
    ADD
        CONSTRAINT ESP_MBR_INFO_PK
            PRIMARY KEY (
                         MBR_NO
                )
    NOT DEFERRABLE
                    INITIALLY IMMEDIATE
                ENABLE
                VALIDATE;

/* EstenPark_원장회원정보 */
CREATE TABLE ESP_LEDG_MBR_INFO
(
    LEDG_REFLT_DT VARCHAR2(8)                      NOT NULL, /* 원장반영일자 */
    MBR_NO        NUMBER(10)                       NOT NULL, /* 회원번호 */
    MBR_ID        VARCHAR2(30)                     NOT NULL, /* 회원ID */
    MBR_NM        VARCHAR2(100)                    NOT NULL, /* 회원명 */
    MBR_TEL_NO    VARCHAR2(15), /* 회원전화번호 */
    REG_USER      VARCHAR2(30) DEFAULT 'EstenPark' NOT NULL, /* 등록사용자 */
    REG_DTTM      DATE         DEFAULT SYSDATE     NOT NULL /* 등록일시 */
)
    STORAGE
(
    BUFFER_POOL DEFAULT
)
    LOGGING
    NOCOMPRESS
    NOCACHE
    NOPARALLEL
    NOROWDEPENDENCIES
    DISABLE ROW MOVEMENT;

COMMENT ON TABLE ESP_LEDG_MBR_INFO IS 'EstenPark_원장회원정보|원장 회원 정보로 하루에 한번씩 데이터를 쌓는다.|';

COMMENT ON COLUMN ESP_LEDG_MBR_INFO.LEDG_REFLT_DT IS '원장반영일자';

COMMENT ON COLUMN ESP_LEDG_MBR_INFO.MBR_NO IS '컬럼값|컬럼값||';

COMMENT ON COLUMN ESP_LEDG_MBR_INFO.MBR_ID IS '회원ID';

COMMENT ON COLUMN ESP_LEDG_MBR_INFO.MBR_NM IS '회원명';

COMMENT ON COLUMN ESP_LEDG_MBR_INFO.MBR_TEL_NO IS '회원전화번호';

COMMENT ON COLUMN ESP_LEDG_MBR_INFO.REG_USER IS '등록사용자|등록사용자||';

COMMENT ON COLUMN ESP_LEDG_MBR_INFO.REG_DTTM IS '등록일시|등록일시||';

CREATE UNIQUE INDEX ESP_LEDG_MBR_INFO_PK
    ON ESP_LEDG_MBR_INFO (
                          LEDG_REFLT_DT ASC,
                          MBR_NO ASC
        )
    STORAGE (
    BUFFER_POOL DEFAULT
    )
    NOLOGGING
    NOCOMPRESS
    NOSORT
    NOPARALLEL;

ALTER TABLE ESP_LEDG_MBR_INFO
    ADD
        CONSTRAINT ESP_LEDG_MBR_INFO_PK
            PRIMARY KEY (
                         LEDG_REFLT_DT,
                         MBR_NO
                )
    NOT DEFERRABLE
                    INITIALLY IMMEDIATE
                ENABLE
                VALIDATE;


/* 데이터 삭제 */
truncate table ESP_MBR_INFO;

truncate table ESP_LEDG_MBR_INFO;

/* ESP_MBR_INFO 테이블 데이터 생성 */
INSERT INTO ESP_MBR_INFO A(A.mbr_no, A.mbr_id, A.mbr_nm, A.mbr_tel_no)
VALUES (1, 'Admin', '관리자', '010-9999-9999');

INSERT INTO ESP_MBR_INFO A(A.mbr_no, A.mbr_id, A.mbr_nm, A.mbr_tel_no)
VALUES (2, 'user02', '이철수', '010-2222-9999');

INSERT INTO ESP_MBR_INFO A(A.mbr_no, A.mbr_id, A.mbr_nm, A.mbr_tel_no)
VALUES (3, 'user03', '김우현', '010-9999-3333');

INSERT INTO ESP_MBR_INFO A(A.mbr_no, A.mbr_id, A.mbr_nm, A.mbr_tel_no)
VALUES (4, 'user04', '신하윤', '010-9999-4444');

INSERT INTO ESP_MBR_INFO A(A.mbr_no, A.mbr_id, A.mbr_nm, A.mbr_tel_no)
VALUES (5, 'user05', '박유일', '010-9999-5555');

/* ESP_LEDG_MBR_INFO 원장 테이블 데이터 생성-> 과거 데이터 */
INSERT INTO ESP_LEDG_MBR_INFO A (A.ledg_reflt_dt, A.mbr_no, A.mbr_id, A.mbr_nm, A.mbr_tel_no)
SELECT '20161211' as ledg_reflt_dt
     , b.mbr_no
     , b.mbr_id
     , b.mbr_nm
     , b.mbr_tel_no
FROM ESP_MBR_INFO B
;

/* ESP_LEDG_MBR_INFO 원장 테이블 데이터 생성-> 현재 데이터 */
INSERT INTO ESP_LEDG_MBR_INFO A (A.ledg_reflt_dt, A.mbr_no, A.mbr_id, A.mbr_nm, A.mbr_tel_no)
SELECT '20161212' as ledg_reflt_dt
     , b.mbr_no
     , b.mbr_id
     , b.mbr_nm
     , b.mbr_tel_no
FROM ESP_MBR_INFO B
WHERE B.MBR_NO IN (1, 2, 5)
;

/* ESP_LEDG_MBR_INFO 원장 테이블 데이터 생성-> 현재 데이터-> 추가 데이터 */
INSERT INTO ESP_LEDG_MBR_INFO A (A.ledg_reflt_dt, A.mbr_no, A.mbr_id, A.mbr_nm, A.mbr_tel_no)
VALUES ('20161212', 6, 'user06', '추가열', '010-9999-9393');

/* ESP_LEDG_MBR_INFO 원장 테이블 데이터 생성-> 현재 데이터-> 변경 데이터 */
UPDATE ESP_LEDG_MBR_INFO A
SET a.mbr_tel_no = '010-8888-8888'
WHERE a.mbr_no = 1;

COMMIT;


MERGE INTO ESP_MBR_INFO A
    USING (
        /* UPDATE, INSERT 대상 데이터 로직 구현 */
        SELECT A.MBR_NO, A.MBR_ID, A.MBR_NM, A.MBR_TEL_NO, A.REG_USER, A.REG_DTTM, 'N' AS DEL_TP_YN
        FROM ESP_LEDG_MBR_INFO A
        WHERE A.LEDG_REFLT_DT = '20161212'
        UNION ALL
        /* DELETE 대상 데이터 로직 구현 */
        SELECT A.MBR_NO, A.MBR_ID, A.MBR_NM, A.MBR_TEL_NO, A.REG_USER, A.REG_DTTM, 'Y' AS DEL_TP_YN
        FROM ESP_MBR_INFO A
        WHERE 1 = 1
          AND NOT EXISTS (SELECT 'O'
                          FROM ESP_LEDG_MBR_INFO SS1
                          WHERE SS1.LEDG_REFLT_DT = '20161212'
                            AND SS1.MBR_NO = A.MBR_NO)) B
    ON (A.MBR_NO = B.MBR_NO)
    WHEN MATCHED THEN
        UPDATE
            SET A.MBR_ID     = B.MBR_ID,
                A.MBR_NM     = B.MBR_NM,
                A.MBR_TEL_NO = B.MBR_TEL_NO,
                A.REG_USER   = B.REG_USER,
                A.REG_DTTM   = B.REG_DTTM
DELETE WHERE (B.DEL_TP_YN = 'Y') /* 삭제구분여부(DEL_TP_YN)에서 Y일 경우 삭제 처리 */
    WHEN NOT MATCHED THEN
INSERT (A.MBR_NO, A.MBR_ID, A.MBR_NM, A.MBR_TEL_NO, A.REG_USER, A.REG_DTTM)
VALUES (B.MBR_NO, B.MBR_ID, B.MBR_NM, B.MBR_TEL_NO, B.REG_USER, B.REG_DTTM);

SELECT * FROM ESP_MBR_INFO;
SELECT * FROM ESP_LEDG_MBR_INFO;


;

