
// The only different between vectors and ArrayList is that , 
// vector is synchronized whereas List is not, and secondly
 // vector doubles itself everytime the element is added in contrast to ArrayList which incerases its size by 50%.

import java.util.*;


public class Vectors{

	Vector vector =  new Vector();

	public void operationOnVector(){

		
	}
}





/*

Sr.No. 	Method & Description
1 	

void add(int index, Object element)

Inserts the specified element at the specified position in this Vector.
2 	

boolean add(Object o)

Appends the specified element to the end of this Vector.
3 	

boolean addAll(Collection c)

Appends all of the elements in the specified Collection to the end of this Vector, in the order that they are returned by the specified Collection's Iterator.
4 	

boolean addAll(int index, Collection c)

Inserts all of the elements in in the specified Collection into this Vector at the specified position.
5 	

void addElement(Object obj)

Adds the specified component to the end of this vector, increasing its size by one.
6 	

int capacity()

Returns the current capacity of this vector.
7 	

void clear()

Removes all of the elements from this vector.
8 	

Object clone()

Returns a clone of this vector.
9 	

boolean contains(Object elem)

Tests if the specified object is a component in this vector.
10 	

boolean containsAll(Collection c)

Returns true if this vector contains all of the elements in the specified Collection.
11 	

void copyInto(Object[] anArray)

Copies the components of this vector into the specified array.
12 	

Object elementAt(int index)

Returns the component at the specified index.
13 	

Enumeration elements()

Returns an enumeration of the components of this vector.
14 	

void ensureCapacity(int minCapacity)

Increases the capacity of this vector, if necessary, to ensure that it can hold at least the number of components specified by the minimum capacity argument.
15 	

boolean equals(Object o)

Compares the specified Object with this vector for equality.
16 	

Object firstElement()

Returns the first component (the item at index 0) of this vector.
17 	

Object get(int index)

Returns the element at the specified position in this vector.
18 	

int hashCode()

Returns the hash code value for this vector.
19 	

int indexOf(Object elem)

Searches for the first occurence of the given argument, testing for equality using the equals method.
20 	

int indexOf(Object elem, int index)

Searches for the first occurence of the given argument, beginning the search at index, and testing for equality using the equals method.
21 	

void insertElementAt(Object obj, int index)

Inserts the specified object as a component in this vector at the specified index.
22 	

boolean isEmpty()

Tests if this vector has no components.
23 	

Object lastElement()

Returns the last component of the vector.
24 	

int lastIndexOf(Object elem)

Returns the index of the last occurrence of the specified object in this vector.
25 	

int lastIndexOf(Object elem, int index)

Searches backwards for the specified object, starting from the specified index, and returns an index to it.
26 	

Object remove(int index)

Removes the element at the specified position in this vector.
27 	

boolean remove(Object o)

Removes the first occurrence of the specified element in this vector, If the vector does not contain the element, it is unchanged.
28 	

boolean removeAll(Collection c)

Removes from this vector all of its elements that are contained in the specified Collection.
29 	

void removeAllElements()

Removes all components from this vector and sets its size to zero.
30 	

boolean removeElement(Object obj)

Removes the first (lowest-indexed) occurrence of the argument from this vector.
31 	

void removeElementAt(int index)

removeElementAt(int index).
32 	

protected void removeRange(int fromIndex, int toIndex)

Removes from this List all of the elements whose index is between fromIndex, inclusive and toIndex, exclusive.
33 	

boolean retainAll(Collection c)

Retains only the elements in this vector that are contained in the specified Collection.
34 	

Object set(int index, Object element)

Replaces the element at the specified position in this vector with the specified element.
35 	

void setElementAt(Object obj, int index)

Sets the component at the specified index of this vector to be the specified object.
36 	

void setSize(int newSize)

Sets the size of this vector.
37 	

int size()

Returns the number of components in this vector.
38 	

List subList(int fromIndex, int toIndex)

Returns a view of the portion of this List between fromIndex, inclusive, and toIndex, exclusive.
39 	

Object[] toArray()

Returns an array containing all of the elements in this vector in the correct order.
40 	

Object[] toArray(Object[] a)

Returns an array containing all of the elements in this vector in the correct order; the runtime type of the returned array is that of the specified array.
41 	

String toString()

Returns a string representation of this vector, containing the String representation of each element.
42 	

void trimToSize()

Trims the capacity of this vector to be the vector's current size.

*/