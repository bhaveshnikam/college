class Solution {
    public void connect(Node root) {
        // code here
        Queue<Node>ans=new ArrayDeque<>();
        Queue<Node>cq=new ArrayDeque<>();
        
        ans.add(root);
        while(ans.size()>0)
        {
            Node node=ans.remove();
            if(ans.size()==0)
            {
                node.nextRight=null;
            }
            else
            {
                node.nextRight=ans.peek();
            }
            if(node.left!=null)
            cq.add(node.left);
            if(node.right!=null)
            cq.add(node.right);
            
            if(ans.size()==0)
            {
                ans=cq;
                cq=new ArrayDeque<>();
            }
        }
        
        
    }
}
