package linearQueue;


import java.util.LinkedList;
import java.util.Queue;

public class AS 

{ Queue<Person>qq;

public AS(){
	this.qq=new LinkedList<>();}
	
	void  enqueue(Person person)
	{
		qq.offer(person);
	}
	
	Person dequeue()
	{
		return qq.poll();
		
		
	}
	
	Person peek()
	{
		return qq.peek();}
	
	boolean isEmpty()
	{
		return qq.isEmpty();
	}

	
	void sort()
	{
		qq.stream().sorted((p1,p2)->Integer.compare(p2.age, p1.age))
		.forEachOrdered(qq:add);
	}
	
	Person search(String sname)
	{
		for(Person per: qq)
		{
			if(per.name.equals(sname))
			{return per;}
		}
		return null;
	}
	
	
	
	
	as a =mew as

}
