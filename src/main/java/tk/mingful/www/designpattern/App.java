package tk.mingful.www.designpattern;

import java.util.Arrays;

/**
 * @author Acer
 * @version 1.0
 * @className App
 * @description ${DESCRIPTION}
 * @create 2019-07-23 14:12
 **/
public class App {

    public static void main(String[] args) {

        String s = "abacbcabababbcbc";
        String t = "abababb";
//        System.out.println(match(s.toCharArray(), t.toCharArray(), 0));
        //
        int [] next = getNext(t.toCharArray(), new int[t.length() + 1]);
        System.out.println(betterMatch(s.toCharArray(), t.toCharArray(), 0, next));

    }

    /**
     * 朴素的模式匹配算法
     *
     * @param s 主串
     * @param t 匹配串
     * @param index 主串起始下标位置
     * @return int
     */
    public static int match(char[] s, char[] t, int index) {

        int i,j,slen,tlen;
        i = index;
        j = 0;
        slen = s.length;
        tlen = t.length;
        while (i < slen && j < tlen) {
            if (s[i] == t[j]) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
            System.out.println("i = " + i + ",j = " + j);
        }
        if (j >= tlen) {
            return i - tlen;
        }
        return  -1;
    }

    public static int betterMatch(char[] s, char[] t, int index, int[] next) {
        int i, j, slen, tlen;
        i = index - 1;
        j = -1;
        slen = s.length;
        tlen = t.length;
        while (i < slen && j < tlen) {
            if (j == -1 || s[i] == t[j]) {
                ++i;
                ++j;
            } else {
                j = next[j];
            }
        }
        if (j >= tlen) {
            return i - tlen;
        }
        return -1;
    }

    private static int[] getNext(char[] p, int[] next) {
        int m, n, plen;
        plen = p.length;
        next[0] = -1;
        m = 0;
        n = -1;
        while (m < plen) {
            if (n == -1 || p[m] == p[n]) {
                ++m;
                ++n;
                next[m] = n;
            } else {
                n = next[n];
            }
            System.out.println("m = " + m + ",n = " + n);
        }
        System.out.println(Arrays.toString(next));
        return next;
    }
}
