/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

//Solution I : slow
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = new Node();
            node = stack.pop();
            res.add(node.val);
            
            for (int i = 0; i < node.children.size(); i++) {
                stack.push(node.children.get(i));
            }
            
        }
        Collections.reverse(res);
        return res;
    }
}

//Solution II: fast, dfs recursion
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        
        dfs(root, res);
        return res;
    }
    
    public void dfs(Node root, List<Integer> res) {
        if (root == null) return;
        for (Node n: root.children) {
            dfs(n, res);
        }
        res.add(root.val);
        
    }
}