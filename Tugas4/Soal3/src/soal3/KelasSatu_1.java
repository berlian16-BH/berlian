package soal3;

class KelasSatu {
    static {
        System.out.println(2);
    }

    static {
        System.out.println(100);
    }

    public KelasSatu(int i) {
        System.out.println(3);
    }

    public KelasSatu() {
        System.out.println(4);
    }

    static {
        System.out.println(11);
    }
}