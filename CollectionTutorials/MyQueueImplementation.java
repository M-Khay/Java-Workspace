package collectionstutorial;
public class MyQueueImplementation<T>{

	private LinkedList<T> linkedList = new LinkedList<T>();

	public boolean add(T element) throw IllegalStateException{
		try{
		
		boolean result = linkedList.add(element);
		return result;
		
		}catch(IllegalStateException e){
		throw e;
		}

	}

	public T remove()throw IllegalStateException{
		try{
			T result = linkedList.get
		}

	}

	public boolean offer(T element){
		try{
			boolean result = linkedList.add(element);
				return result;
				}catch(IllegalStateExcpetion e){
					return null;
					}
			}
}