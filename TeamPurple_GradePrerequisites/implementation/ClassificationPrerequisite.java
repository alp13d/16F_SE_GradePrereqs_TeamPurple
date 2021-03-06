/**
 * 
 */
package implementation;

/**
 * 
 * @author Sebastian Snyder
 *
 */
public final class ClassificationPrerequisite extends Prerequisite
{
	public static final ClassificationPrerequisite FRESHMAN = new ClassificationPrerequisite();
	public static final ClassificationPrerequisite SOPHOMORE = new ClassificationPrerequisite();
	public static final ClassificationPrerequisite JUNIOR = new ClassificationPrerequisite();
	public static final ClassificationPrerequisite SENIOR = new ClassificationPrerequisite();
	public static final ClassificationPrerequisite GRADUATE = new ClassificationPrerequisite();

	public static final String[] ClStrings = {"FR","SO","JR","SR","GR"};
	public static final ClassificationPrerequisite[] ClPrerequisites= {FRESHMAN,SOPHOMORE,JUNIOR,SENIOR,GRADUATE};
	
	private ClassificationPrerequisite()
	{
	}

	@Override
	public boolean IsMetBy(Student stu)
	{
		String c = stu.GetClassification();
		for(int i = ClStrings.length-1;i >=0;i--)
		{
			if(c.equals(ClStrings[i]))
				return true;
			else if(this == ClPrerequisites[i])
				return false;
		}
		return false;
	}

	@Override
	public String toString()
	{
		for(int i = 0;i < ClStrings.length;i++)
		{
			if(this == ClPrerequisites[i])
			{
				return "CLASS("+ClStrings[i]+")";
			}
		}
		return "CLASS(ERR)";
	}
}
