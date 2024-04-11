package bkw.java.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : ex1
 * @since : 2024-04-11
 */
public class ex1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");

        String[] stringArray = stringList.toArray(new String[0]);
        System.out.println("array size : " + stringArray.length); // 3

        String[] stringArray1 = stringList.toArray(new String[5]);
        System.out.println("array size1 : " + stringArray1.length); // 5

        /*
        1. List를 toArray 메서드에 파라미터로 넘어가는 배열 객체의 size만큼의 배열로 전환된다.
        2. 해당 List size가 인자로 넘어가는 배열 객체의 size보다 클때, 해당 List의 size로 배열이 만들어진다. ex) stringArray
        3. 반대로 해당 List size가 인자로 넘어가는 배열 객체의 size보다 작을 때는, 인자로 넘어가는 배열 객체의 size로 배열이 만들어진다.  ex) stringArray1
        * */

        /**
         List<String>:
            List 인터페이스를 구현한 클래스들의 객체를 담을 수 있는 참조 변수입니다.
            List는 순서가 있는 자료구조로, 중복된 요소를 허용합니다. ArrayList, LinkedList 등이 List 인터페이스를 구현한 클래스들입니다.
            List는 동적으로 크기가 조절되며, 크기가 가변적입니다.

         String[]:
            배열(Array)은 고정된 크기의 순차적인 요소들의 모음입니다.
            배열의 크기는 생성할 때 지정되며, 크기를 변경할 수 없습니다. 또한 배열의 요소는 동일한 자료형이어야 합니다.
            배열은 기본적으로 요소의 추가나 삭제가 번거롭습니다. 배열의 크기를 변경하려면 새로운 배열을 생성하고 기존 요소들을 복사해야 합니다.

         보통 new String[0]을 사용하여 배열을 만드는 경우가 많습니다. 이렇게 하면 비어있는 배열이 생성되며, 이후 필요에 따라 배열의 크기를 동적으로 조절할 수 있습니다.

         new String[0]을 사용하는 이유는 배열의 크기가 0인 상태로 초기화하여,
         이후에 요소가 추가될 때 배열의 크기를 동적으로 조절할 수 있기 때문입니다.
         따라서, 초기 크기가 0인 배열을 만들어두면 불필요한 메모리 공간을 차지하지 않으면서 효율적으로 요소를 추가할 수 있습니다.
         */
    }
}
