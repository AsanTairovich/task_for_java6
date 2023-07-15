import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Task {

    /**
     * Метод в качестве параметра принимает год, месяц и день в котором ты родился.
     * Ваша задача выяснить какой это день дни недели(Понедельник, Вторник, Среда, Четверг, Пятница, Суббота, Вторник).
     * Примечание: Месяц = 30
     *
     * @param year  = 2000
     * @param month = 11
     * @param day   = 8
     * @return "Среда"
     */
    public String getWeekOfDay(int year, int month, int day) {

        return "";
    }

    /**
     * Метод в качестве параметра берет два массива, вам слить элементы этих массивов,
     * потом сортировать и найти медиану.
     *
     * @param array       = {1,3}
     * @param secondArray = {2}
     * Объединенный массив = {1, 2,3}
     * @return 2;
     *
     * @param array       = {1,2}
     * @param secondArray = {3,4}
     * Объеденный массив = {1,2,3,4} и медиана (2+3) / 2 = 2.5;
     * @return 2.5
     */
//    int[] number = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
//
//    int count3 = 0;
//    int count4 = 0;
//
//        for (int i = 0; i < number.length; i++) {
//        max = Math.max(max, number[i]);
//        count3 = i;
//        min = Math.min(max, number[i]);
//    }
    public double method1(int[] array, int[] secondArray) {
//        int a = array.length +secondArray.length;
//        int[] test1= new int[a];
//        int[] test2= new int[]{};
//
//        for (int i = 0; i < array.length; i++) {
//            for (int i1 = 0; i1 < secondArray.length; i1++) {
//                for (int i2 = 0; i2 < test1.length; i2++) {
//                    test1[i2] = array[i];
//                    i2++;
//                    test1[i2] = secondArray[i1];
//                }
//            }
//        }
//        Arrays.sort(test1);
//        if (a / 2 == 1) {
//            int test = 0;
//            for (int j = 0; j < test1.length; j++) {
//                test = test1.length / 2;
//            }
//            return test;
//        }
//        else {
//            for (int j = 0; j < test1.length; j++) {
//                int b = Math.round(a/2);
//                int c = a/2-1;
//                return (b+c)/2;
//            }
//        }
//        return a;


        int arrayLength = array.length;
        int secondArrayLength = secondArray.length;
        int[] a = new int[arrayLength + secondArrayLength];
        int k = 0;
        for (int i : array) {
            a[k++] = i;
        }

        for (int i : secondArray) {
            a[k++] = i;
        }

        Arrays.sort(a);

        double median;
        if (a.length % 2 == 0) {
            median = a[a.length / 2];
        } else {
            median = (double) (a[(a.length - 1) / 2] + a[(a.length + 1) / 2]) / 2;
        }

        return median-1;
    }

    /**
     * Метод в качестве параметра берет матрицу он же двойной массив,
     * вам надо написать метод таким образом, что элементы находится по диагонали должны отсортироваться.
     *
     * @param matrix = {{5,2,3},
     *               {4,9,6},
     *               {7,8,1}}
     * @return matrix = {{1,2,3},
     * {4,5,6},
     * {7,8,9}}
     */
    public int[][] getSortedArray(int[][] matrix) {
        return new int[0][0];
    }

    /**
     * Если в #longWord содержится строка #word, то нужно вернуть первый индекс
     * пересечения
     *
     * @param longWord - sadbutsad
     * @param word     - but
     * @return 3 - так как в стоке sadbutsad(sadBUTsad), but начинается с третьего индекса
     */
    public int getIndex(String longWord, String word) {
        return 0;
    }

    /**
     * В качестве параметра приходит массив строк,
     * ваша задача вернуть массив объектов, со строкой и его количеством
     *
     * @param text {ручка, телефон, книга, телефон, ручка, телефон}
     * @return {@link DuplicateWord} [{word=ручка,count=2},{word=телефон,count=3},{word=книга,count=1}]
     */
    public DuplicateWord[] getDuplicateWord(String[] text) {
        return null;
    }

    /**
     * Берет массив чисел, возвращает самое маленькое пропущенное значение
     *
     * @param numbers {1,2,3,5,6,8,12}
     * @return 4
     */
    public int getSmallestMissing(int[] numbers) {
        int g = 0;
        int f = 0;
        for (int i = 0; i < numbers.length; i++) {
            g = Math.max(g, numbers[i]);
            for (int j = 0; j < g; j++) {
                if (numbers[i] != j) {
                    f = j;
                }
            }
        }
        return f;
    }


    /**
     * Учитывая массив nums из различных целых чисел, верните все возможные перестановки, в виде двойного массива.
     *
     * @param nums - [1,2,3]
     * @return [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
     */
    public List<List<Integer>> permute(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

        }
        return null;
    }

    /**
     * Учитывая массив строк, сгруппируйте анаграммы вместе.
     * <p>
     * Анаграмма - это слово или фраза, образованные путем перестановки букв другого слова или фразы,
     * обычно с использованием всех исходных букв ровно один раз.
     *
     * @param strs ["eat","tea","tan","ate","nat","bat"]
     * @return [["bat"],["nat","tan"],["ate","eat","tea"]]
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> stringListHashMap = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            String words = new String(chars);
            if (stringListHashMap.containsKey(words)) {
                stringListHashMap.get(words).add(s);
            } else {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(s);
                stringListHashMap.put(words, arrayList);
            }
        }
        return null;
    }

    /**
     * #n cтепень числа #x
     * Примечание. Не используем встроенные библиотеки джава
     *
     * @param x 2
     * @param n 10
     * @return 1024.00000
     */
    public double myPow(double x, int n) {
        return 0;
    }

    static class DuplicateWord {
        String word;
        String count;
    }
}
