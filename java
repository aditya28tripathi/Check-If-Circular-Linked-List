class GfG
{
    boolean isCircular(Node head)
    {
  
   if(head == null )
       return true;
       
       Node temp = head;
       
       while(temp.next!=head){
           temp=temp.next;
           if(temp==null)
               break;
           }
           
           if(temp==null)
           return false;
           else
           return true;
       
               
       
   

    }
}
