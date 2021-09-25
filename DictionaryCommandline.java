public class DictionaryCommandline {
    public static void showAllWords() {
        Dictionary.output();
    }

    public static void dictionaryBasic() {
        DictionaryManagement.insertFromCommandline();
        showAllWords();
    }
}
