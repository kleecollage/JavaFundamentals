public interface Translator {
    // public/abstract methods
    void translate();

    // methods with default implementation
    default void initTranslator() {
        System.out.println("Initializing translator...");
    }
}

class Spanish implements Translator {
    @Override
    public void translate() {
        System.out.println("Translating to Spanish...");
    }
}

class French implements Translator {
    @Override
    public void translate() {
        System.out.println("Translating to French...");
    }
    @Override
    public void initTranslator() {
        System.out.println("Initializing translator on French u la la...");
    }
}

class TestTranslator {
    public static void main(String[] args) {
        Translator spanish = new Spanish();
        spanish.initTranslator();
        spanish.translate();
        // Translator on french
        Translator french = new French();
        french.initTranslator();
        french.translate();
    }
}