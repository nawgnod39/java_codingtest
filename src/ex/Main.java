package ex;


import java.io.IOException;

import java.util.Scanner;


import java.io.*;
import java.util.*;

public class Main {

    static int[][] map;

    public static void main(String[] args) throws IOException {
        // 변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n;

        // 입력
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        for (int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            System.out.println(st.countTokens());
            for (int j=0; j<n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 출력
        bw.flush();

        br.close();
        bw.close();
    }
}