/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package my.AFSA2;

/**
 *
 * @author Owner
 */
import java.util.*;
/**
 *
 * @author Owner
 */
public class Seed {
private int length;
final int MAX_LENGTH=1000;
private String[] Holder = new String[MAX_LENGTH];
private int currpos;//used as indexer

//Methods
//Constructor
Seed() {
    length = 0;
    currpos=0;

}
//Method for inserting data into seed object
public void InsertData(String value){
    Holder[length]=value;
    length++;


}
//Returns length of seed object
public int Length(){
     return length;
    }
// Empties seed object
void EmptySeedObject(int leng) {
     for(int z = 0; z<leng; z++)
     {
     Holder[z]=Holder[z+1];
     length--;
    }
     System.out.println("length in emptyseedobject is:"+length);
    }
    void Reset()
    {
    currpos=0;
    }
String GetNext()
    {
    
    String item1;
        item1 = Holder[currpos];
	if(currpos==length-1)
	{
	currpos=0;
	}
	else
	{
		currpos++;
	}
	return item1;
    }

/*String Show()
    {
    Object show1;
    String show2;
    show1=Holder.get(8);
    show2 = show1.toString();
    return show2;
    }*/
}



