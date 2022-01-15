package OOP4Principles;

public class Encapsulation {
    private String flavor;

    public void setFlavor(String newFlavor){
        flavor = newFlavor;
    }
    public String getFlavor(){
        return flavor;
    }

    public void openBag(){
        System.out.println("Bag opened!");
    }
}
