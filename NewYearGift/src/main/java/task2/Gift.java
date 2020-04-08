package task2;
import task2.Sweet;

import java.util.ArrayList;
import java.util.Collections;
public class Gift {
    ArrayList<Sweet> gifts = new ArrayList<>();
public void add(Sweet sweet)
{
    gifts.add(sweet);
}
public void sort()
{
    Collections.sort(gifts);
}
    public int totalWeight()
    {
        int weight=0;
        for(int i=0;i<gifts.size();i++)
        {
            weight+= gifts.get(i).getWeight();
        }
        return weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<this.gifts.size();i++){
            sb.append(gifts.get(i).getName()+"\n");
        }
        return sb.toString();
    }
}
