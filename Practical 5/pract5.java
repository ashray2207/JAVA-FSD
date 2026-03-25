public class pract5 {
    public class Product{
        int ProductId;
        String Name;
        float Price;
    }
    public class Electronic extends Product{
        String Warranty;
        void display(){
            System.out.println("product id:"+super.ProductId+"\nName:"+super.Name+"\nPrice:"+super.Price+"\nWarranty:"+ Warranty);
        }
    }
    public class Clothing extends Product{
        int Size;
        String colour;

        void display(){
            System.out.println("product id:"+super.ProductId+"\nName:"+super.Name+"\nPrice:"+super.Price+"\nSize:"+ Size+"\nColor:"+colour);
        }
    }
    public void main(String[] args){
        Electronic Fridge = new Electronic();
        System.out.println("Fridge details:\n");
        Fridge.ProductId=01;
        Fridge.Name="Fridge";
        Fridge.Price=25000;
        Fridge.Warranty="3 months\n";
        Fridge.display();
        System.out.println("-------------------------------------------");
        System.out.println("\nClothes details:\n");
        Clothing Shirt = new Clothing();
        Shirt.ProductId=05;
        Shirt.Name="Shirt";
        Shirt.Price=499;
        Shirt.Size=32;
        Shirt.colour="blue";
        Shirt.display();
    }
}