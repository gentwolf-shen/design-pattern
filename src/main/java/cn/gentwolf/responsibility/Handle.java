package cn.gentwolf.responsibility;

public abstract class Handle {
    private Handle next;

    public Handle getNext() {
        return next;
    }

    public void setNext(Handle next) {
        this.next = next;
    }

    public abstract void handleRequest(int days);
}

class PersonA extends Handle {
    public void handleRequest(int days) {
        if (days <= 2) {
            System.out.println("Person A -> "+ days);
        } else {
            if (this.getNext() != null) {
                this.getNext().handleRequest(days);
            } else {
                System.out.println("Person A OVER");
            }
        }
    }
}

class PersonB extends Handle {
    public void handleRequest(int days) {
        if (days <= 7) {
            System.out.println("Person B -> " + days);
        } else {
            if (this.getNext() != null) {
                this.getNext().handleRequest(days);
            } else {
                System.out.println("Person B OVER");
            }
        }
    }
}

class PersonC extends Handle {
    public void handleRequest(int days) {
        if (days <= 15) {
            System.out.println("Person C -> "+ days);
        } else {
            System.out.println("Person C END");
        }
    }
}