import java.util.*;
class braces{
	public static int check(String s)
	{
		Stack<Character> stack=new Stack<Character>();
		int i=0;
		while(i<s.length())
		{
			char a=s.charAt(i);
			if(a=='(' || a=='+'||a=='-'||a=='*'||a=='/')
			{
				stack.push(a);
			}
			else if(a==')')
			{
				if(stack.peek() == '(')
				{ 
                    System.out.print("yes ->");
                    return 1;
                }
                else
                { 
                    while(!stack.isEmpty() && stack.peek() != '(')
                    { 
                        stack.pop(); 
                    } 
                    stack.pop(); 
                } 
			}
			i++;
		}
		System.out.print("NO ->");
        return 0; 
	}
	public static void main(String[] args){
        String a = "(a+b+(c+d))";
        System.out.println(check(a));
    }
}
