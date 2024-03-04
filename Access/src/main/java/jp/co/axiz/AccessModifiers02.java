package jp.co.axiz;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//↑自動インポートされた、理由不明

public class AccessModifiers02 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    }
//↓アクセス修飾子をprotectedに変更publicだと「HttpServlet」内にあるアクセス修飾子がproctectedだからダメ
//アクセス修飾子はproctedと同等かそれ以下でじゃないとだめ
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    }
}


