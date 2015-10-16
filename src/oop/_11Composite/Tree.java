package oop._11Composite;

/**
 * 组合模式（Composite）
 * @ClassName: Tree 
 * @Description: 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便<br>
 * 使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
 * @author wenxucheng@163.com
 * @date 2015年6月15日 下午2:49:32
 */
public class Tree {
	TreeNode root = null;  
    public Tree(String name) {  
        root = new TreeNode(name);  
    }  
    public static void main(String[] args) {  
        Tree tree = new Tree("A");  
        TreeNode nodeB = new TreeNode("B");  
        TreeNode nodeC = new TreeNode("C");  
          
        nodeB.add(nodeC);  
        tree.root.add(nodeB);  
        System.out.println("build the tree finished!");  
        System.out.println(tree.root.getName());
        for (TreeNode tn : tree.root.getChildren()) {
        	System.out.println(tn.getName());
			for (TreeNode tn1 : tn.getChildren()) {
				System.out.println(tn1.getName());
			}
		}
    }  
}
