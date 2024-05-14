import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<String>> myList = new ArrayList();

        ArrayList<String> listA =new ArrayList();
        listA.add("pasta");
        listA.add("garlic");
        listA.add("donuts");
        
        ArrayList<String> listB =new ArrayList();
        listB.add("coke");
        listB.add("pepsi");
        listB.add("guarana");

        ArrayList<String> listC =new ArrayList();
        listC.add("apple");
        listC.add("banana");
        listC.add("orange");

        myList.add(listA);
        myList.add(listB);
        myList.add(listC);

        for(int i=0; i<myList.size(); i++){
            System.out.println();
            for(int j=0; j<myList.get(i).size(); j++){
                System.out.println(myList.get(i).get(j));
            }
        }
        
    }    
    
}