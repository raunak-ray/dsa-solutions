/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) return ans;

        Queue<TreeNode> qu = new LinkedList<>();

        qu.offer(root);

        while (!qu.isEmpty()) {
            int size = qu.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i<size; i++) {
                TreeNode temp = qu.poll();
                list.add(temp.val);

                if (temp.left != null) qu.offer(temp.left);
                if (temp.right != null) qu.offer(temp.right);
            }

            ans.add(list);
        }

        return ans;
    }
}