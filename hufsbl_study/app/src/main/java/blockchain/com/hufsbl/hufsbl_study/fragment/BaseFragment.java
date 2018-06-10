package blockchain.com.hufsbl.hufsbl_study.fragment;

/**
 * Created by user on 2018-06-10.
 */

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import blockchain.com.hufsbl.hufsbl_study.R;

public class BaseFragment extends Fragment {

    public void returnDlg(String alamText) {

        AlertDialog.Builder dlg = new AlertDialog.Builder(getContext());
        //dlg.setTitle("버튼 1개 대화상자"); // 제목
        dlg.setMessage(alamText); // 내용
        //dlg.setIcon(R.drawable.ic_launcher); // 아이콘

        dlg.setNegativeButton("확인", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        dlg.show(); // 보이다

    }

}