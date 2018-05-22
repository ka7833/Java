 /**
 * Write a description of class Item here.
 * 
 * @author (Kaleab Admassu) 
 * @version (a version number or a date)
 */
public class Item implements Comparable
{
    private String itemName;
    private String category;
    private int quantity;
    private double price;

    public Item(String itName, String catg, int quant, double amount)
    {
        itemName= itName;
        category= catg;
        quantity= quant;
        price= amount;
    }

    public String toString()
    {
        String s="";
        s+= " Item name: " + itemName + " Category: " + category + " Quantity: " + quantity + " Price: " + price;
        return s;
    }

    public int compareTo(Object other)
    {
        double otherPrice=((Item)other).getPrice();
        char otherCat= ((Item)other).getCategory().charAt(1);
        if(price==otherPrice)
        {
            if(category.charAt(1)==otherCat)
                return 0;
            if(otherCat=='W')
            {
                if(category.charAt(1)=='M')
                    return -1;
                if(category.charAt(1)=='C')
                    return 1;             
            }
            if(otherCat=='M')
            {
                return 1; 
            }
            else 
            {
                return -1;
            }
        } 

        return (int)(otherPrice - price); 
    }

    public double getPrice()
    {
        return price;
    }

    public String getCategory()
    {
        return category;
    }

}
