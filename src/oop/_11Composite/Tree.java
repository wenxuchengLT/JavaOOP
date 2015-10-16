package oop._11Composite;

/**
 * ���ģʽ��Composite��
 * @ClassName: Tree 
 * @Description: ���ģʽ��ʱ�ֽв���-����ģʽ�ڴ����������νṹ������ʱ�ȽϷ���<br>
 * ʹ�ó�������������������һ����в����������ڱ�ʾ���νṹ�У���������������ȡ�
 * @author wenxucheng@163.com
 * @date 2015��6��15�� ����2:49:32
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
