package GraphTheory.GraphConstructionwithVertexWeightsUsingAdjacencyList;

import java.util.*;

/**
 * 一般用于点的范围较大([-10^9,10^9])，或者含有负数的点，一般会使用离散化建图，
 * 或者有的不是点，而是字符串与字符串之间存在相互转换的关系，就可以使用哈希表这种数据结构来实现离散化建图。
 */
public class Template {
    public static void main(String[] args) {
        int N = 100010;
        Map<Integer, List<Map.Entry<Integer, Integer>>> path = new HashMap<>();

        // 添加节点 u 到节点 v 的边权为 w
        int u = 1, v = 2, w = 3;
        if (!path.containsKey(u)) {
            path.put(u, new ArrayList<>());
        }
        path.get(u).add(new AbstractMap.SimpleEntry<>(v, w));

        // 遍历节点 u 的所有能到的点和边权
        int node = 1;
        if (path.containsKey(node)) {
            for (Map.Entry<Integer, Integer> entry : path.get(node)) {
                int target = entry.getKey();
                int weight = entry.getValue();
                // 进行处理
            }
        }
    }
}
