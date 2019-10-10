package model.data_structures;

public class HashTableSeparateChaining<T extends Comparable<T>> 
{
	int capacidad;
	int[] keys;
	Nodo[] data;
	
	public HashTableSeparateChaining(int m)
	{
		capacidad = m;
		keys = new int[m];
		data = new Nodo[m];
	}
	

}
