public class PriorityQDemo

{

// array in sorted order, from max at 0 to min at size-1

private int maxSize;
private long[] queArray;
private int nItems;

public PriorityQDemo(int s) 
{
maxSize = s;
queArray = new long[maxSize];
nItems = 0;
}

public void insert(long item) 
{
int i;
if (nItems == 0)
// insert at 0
queArray[nItems++] = item; 
else 
{
// start at end,
for (i = nItems - 1; i >= 0; i--) 
{
// if new item larger,
if (item > queArray[i]) 
// shift upward
queArray[i + 1] = queArray[i];
else
// if smaller,
break; 
// done shifting
}
queArray[i + 1] = item; 

// insert it
nItems++;
} // end else (nItems > 0)
}

public long remove()
{
return queArray[--nItems];
}

public long peekMin()
{
return queArray[nItems - 1];
}

public boolean isEmpty()
{
return (nItems == 0);
}

public boolean isFull()
{
return (nItems == maxSize);
}

public static void main(String[] args) 

{

PriorityQDemo thePQ = new PriorityQDemo(5);

thePQ.insert(30);
thePQ.insert(50);
thePQ.insert(10);
thePQ.insert(40);
thePQ.insert(20);

while (!thePQ.isEmpty()) 
{
long item = thePQ.remove();
// 10, 20, 30, 40, 50
System.out.print(item + " "); 
}
System.out.println("");
}

}

