public class OverloadingVarargsExp {

    public void displayData(String ... values){
        System.out.println("Number of argumetns passed " + values.length);

        for(String s: values){
            System.out.println(s + " ");
        }
    }

    public void displayData(int ... values){
        System.out.println("Number of argumetns passed "+ values.length);
        for(int i : values){
            System.out.println(i + " ");
        }
    }

    public void displayData(String a, int ... values){
        System.out.println(" a " + a);
        System.out.println("Number of argumetns passed " + values.length);
        for(int i : values){
            System.out.println(i + " ");
        }
    }



}
