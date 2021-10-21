import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Project name(项目名称)：不可变集合
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/21
 * Time(创建时间)： 20:00
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        for (String arg : args)
        {
            System.out.println(arg);
        }
        List<String> l = List.of("1", "2", "3", "4", "5", "6", "7");
        System.out.println(l);
        l.forEach(System.out::print);
        System.out.println();
        System.out.println("包含元素3：");
        Object[] s = l.stream().filter(e -> e.contains("3")).toArray();
        for (Object ss : s)
        {
            System.out.println(ss);
        }
        Set<Integer> set = Set.of(1, 15, 9, 27, 6, 7, 5, 4, 3, 22, 33, 14, 17);
        System.out.println(set);
        for (int i : set)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("大于14的数量：");
        System.out.println(set.stream().filter(e -> e > 14).count());
        System.out.println("小于10的元素：");
        Object[] o = set.stream().filter(e -> e < 10).toArray();
        for (Object object : o)
        {
            System.out.print(object + " ");
        }
        System.out.println();
        Map<String, Integer> map = Map.of("语文", 98, "数学", 79, "英语", 68);
        System.out.println(map);
        for (String maps : map.keySet())
        {
            System.out.print(maps + "  ");
            System.out.println(map.get(maps));
        }
        System.out.println();
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
