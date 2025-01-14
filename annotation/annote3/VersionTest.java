import java.lang.annotation.Annotation;

public class VersionTest 
	{
public static void main(String[] args) 
	{
try
	{
Class<?> c =Class.forName("VersionedClass");
Annotation[] array = c.getAnnotations();

for (Annotation an : array) 
	{

		if (an instanceof Version) 
			{
				Version v = (Version) an;
				System.out.println("Version: V" + v.major() + "." + v.minor() +	"R" + v.release());
			}
	}
}
catch (Throwable t) 
	{
		t.printStackTrace(System.err);
	}
 }
}