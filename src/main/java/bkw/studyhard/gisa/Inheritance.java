package bkw.studyhard.gisa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Please explain the class!!
 *
 * @author : kma04
 * @fileName : Inheritance
 * @since : 2023-07-21
 */

class Parent {
    int x = 100;

    Parent() {
        this(500);
    }

    Parent(int x) {
        this.x = x;
    }

    int getX() {
        return x;
    }
}

class Child extends Parent {
    int x = 4000;

    Child() {
        this(5000);
    }

    Child(int x) {
        this.x = x;
    }
}

public class Inheritance {
    final static Logger logger = LoggerFactory.getLogger(Inheritance.class);
    public static void main(String[] args) {
        Child obj = new Child();
        logger.info(String.valueOf(obj.getX()));

    }
}
