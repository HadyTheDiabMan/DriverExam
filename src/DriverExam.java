/**
 * 
 * @author Hady Diab, PD 5 ODD DAYS, DriverExam.
 *
 */
public class DriverExam 
{
private char[] correctAnswers;


public DriverExam(char[] correctAnsList)
{
	correctAnswers=correctAnsList;
}
//dont need to perm student answers. just compare.
//public void boolean passed()

public int totalCorrect(char[]studentAnswers)
{
	int numberCorrect=0;
	for(int i=0;i<studentAnswers.length;i++)
	{
		if(studentAnswers[i]==correctAnswers[i])
		{
			numberCorrect++;
		}
		
	}
	return numberCorrect;
}

public int totalIncorrect(char[]studentAnswers)
{
	int numberIncorrect=0;
	for(int i=0;i<studentAnswers.length;i++)
	{
		if(studentAnswers[i]!=correctAnswers[i])
		{
			numberIncorrect++;
		}
		
	}
	return numberIncorrect;
}


public boolean passed(char[]studentAnswers)
{
	int numberCorrect=0;
	for(int i=0;i<studentAnswers.length;i++)
	{
		if(studentAnswers[i]==correctAnswers[i])
		{
			numberCorrect++;
		}
		
	}
	if(numberCorrect/correctAnswers.length<=0.75)
	{
		return false;
	}
	else
		return true;
}
public int[] questionsMissed(char[]studentAnswers)
{
	int numberIncorrect=0;
	int[]  questionIncorrect = new int[studentAnswers.length];
	for(int i=0;i<studentAnswers.length;i++)
	{
		if(studentAnswers[i]!=correctAnswers[i])
		{
			
			questionIncorrect[i]=i++;
			
			
		}
		
	}
	return questionIncorrect;
}


//call totalincorrect to establish length for questionsmissed
//totalincorrect() (run method in same class)
//(put inside declaration of array), or store into var
	

}
