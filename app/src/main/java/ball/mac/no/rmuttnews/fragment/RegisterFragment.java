package ball.mac.no.rmuttnews.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ball.mac.no.rmuttnews.R;
import ball.mac.no.rmuttnews.utility.MyConstant;
import ball.mac.no.rmuttnews.utility.PostNewUserToServer;

/**
 * Created by masterung on 23/12/2017 AD.
 */

public class RegisterFragment extends Fragment {

    //    Explicit
    private String emailString, passwordString, firstString, lastString;


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Register Controller
        registerController();


    }   // Main Method

    private void registerController() {

        Button button = getView().findViewById(R.id.btnRegister);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Initial EditText
                EditText emailEditText = getView().findViewById(R.id.etEmail);
                EditText passwordEditText = getView().findViewById(R.id.etPassword);
                EditText firstEditText = getView().findViewById(R.id.etFirstname);
                EditText lastEditText = getView().findViewById(R.id.etLastname);

//                Get Value From EditText
                emailString = emailEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();
                firstString = firstEditText.getText().toString().trim();
                lastString = lastEditText.getText().toString().trim();

//                Check Space
                if (emailString.isEmpty() || passwordString.isEmpty() ||
                        firstString.isEmpty() || lastString.isEmpty()) {

//                    Have Space
                    Toast.makeText(getActivity(), "Have Space", Toast.LENGTH_SHORT).show();

                } else {

//                    No Space
                    uploadToServer();

                }


            }   // onClick
        });


    }

    private void uploadToServer() {

        try {

            MyConstant myConstant = new MyConstant();
            PostNewUserToServer postNewUserToServer = new PostNewUserToServer(getActivity());
            postNewUserToServer.execute(emailString, passwordString, firstString,
                    lastString, myConstant.getUrlPostUserString());

            String result = postNewUserToServer.get();
            Log.d("23DecV1", "Result ==> " + result);

            if (Boolean.parseBoolean(result)) {

                getActivity().getSupportFragmentManager().popBackStack();

            } else {

                Toast.makeText(getActivity(), "Cannot Upload New User", Toast.LENGTH_SHORT).show();

            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        return view;
    }
}   // Main Class
