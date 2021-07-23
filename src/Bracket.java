@
		{
			char ch = s.charAt(i);
			
			if(ch=='('||ch=='{'||ch=='[')
			{
				stack.push(ch);
			}
			else if(ch==']')
			{		
			   if(stack.isEmpty()||stack.pop()!='[')
			    {
				return false;
			    }
			}
			
			else if(ch=='}')
			{
				if(stack.isEmpty()||stack.pop()!='{')
				{
					return false;
				}
				
			}
			
			else if(ch==')')
			{
				if(stack.isEmpty()||stack.pop()!='(')
				{
					return false;
				}
			}
		}
		
		
		return true;
		
	}

}
