import java.util.ArrayList;

public class Excepciones
{
    public static void main(String[] args) 
    {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");

        for(int i = 0; i < myList.size(); i++) 
        {
            try
            {
                int castedValue = (int) myList.get(i);
                System.out.println("El numero es: "+castedValue);
            } 
            catch (ClassCastException e)
            {
                System.out.println("No pertenece al tipo INT");
            }
        }
    }
}