/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong2.donglenh;

import lthdt.chuong2.logiclayer.PhuongTrinhBac2;

/**
 *
 * @author vuhuy
 */
public class testPTB2 {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac 2");
            PhuongTrinhBac2 obj = new PhuongTrinhBac2(-2, -4, 2);
//            obj.giaiPhuongTrinh();
            System.out.println(obj.toString());
    }
}
