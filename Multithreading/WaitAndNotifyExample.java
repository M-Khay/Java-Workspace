import java.util.concurrent.*;
import java.util.*;

class Chat{

	boolean flag = false;
	public synchronized void question(String question){
		if(flag){
			try{		
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}

			System.out.println(question);
			flag=true;
			notify();
	}	

	public synchronized void answer(String answer){
		if(!flag){
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println(answer);
		flag=false;
		notify();
	}
}


class AnswerRunnable implements Runnable{
	Chat chatAnswer;
	ArrayList<String> chat;
	public  AnswerRunnable(Chat chatAnswer,ArrayList<String> chat){
		this.chatAnswer= chatAnswer;
		this.chat = chat;
	}

	@Override
	public void run(){
		for(String answers:chat){
			chatAnswer.answer(answers);
		}
	}
}


class QuestionsRunnable implements Runnable{
	Chat chatQuestion;
	ArrayList<String> chat;
	public  QuestionsRunnable(Chat chatQuestion,ArrayList<String> chat){
		this.chatQuestion = chatQuestion;
		this.chat= chat;

	}
	@Override 
	public void run(){
		for(String questions : chat){
		chatQuestion.question(questions);
	}
	}
}


public class WaitAndNotifyExample{
	


public static void main(String[] args){

		WaitAndNotifyExample example = new WaitAndNotifyExample();
		Chat chat=  new Chat();

		ArrayList<String> questions = new ArrayList<String>(Arrays.asList("Q: Hi","Q: How are you","Q: I'm doing great"));
		ArrayList<String> answers =  new ArrayList<String>(Arrays.asList("A: Hello","A; Im doing great!How about yourself?","A: sweet"));
		QuestionsRunnable questionsRunnable = new QuestionsRunnable(chat, questions);
		Thread questionThread= new Thread (questionsRunnable);
		questionThread.start();
		Thread answerThread= new Thread(new AnswerRunnable(chat,answers));
		answerThread.start();


	}

}
