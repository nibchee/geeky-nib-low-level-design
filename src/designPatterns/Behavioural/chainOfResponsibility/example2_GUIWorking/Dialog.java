package designPatterns.Behavioural.chainOfResponsibility.example2_GUIWorking;

public class Dialog extends Container {
    private String wikiPageURL;

    public Dialog(String wikiPageURL) {
        this.wikiPageURL = wikiPageURL;
    }

    @Override
    public void showHelp() {
        if (wikiPageURL != null) {
            // Open the wiki help page.
            System.out.println("Open wiki page: " + wikiPageURL);
        } else {
            super.showHelp();
        }
    }
}
