package newFile;

import java.util.LinkedList;

/**
 * URL队列类
 ******************************************
 * @author jiangyao  [2017年11月29日 下午7:46:26]
 ******************************************
 */
public class Queue {
	
	//使用链表实现队列
	private LinkedList queue = new LinkedList();
	
	//入队列
	public void enQueue(Object obj){
		queue.addLast(obj);
	}
	
	//出队列
	public Object deQueue() {
		return queue.removeFirst();
	}
	
	//判断队列是否为空
	public boolean isQueueEmpty() {
		return queue.isEmpty();
	}
	
	//判断是否包含obj
	public boolean contains(Object obj) {
		return queue.contains(obj);
	}
}
