package freedomradio.kano.com.freedomradio;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProgramsFragment extends Fragment {
    View rootview;

    public ProgramsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview = inflater.inflate(R.layout.fragment_programs, container, false);
        ListView listView = (ListView) rootview.findViewById(R.id.listViewprograms);

        listView.setAdapter(new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1,
                new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String sText = ((TextView) view).getText().toString();
                Intent intent = null;
                if (sText.equals("Sunday")) {
                    intent = new Intent(getContext(), Sun.class);
                }else if (sText.equals("Monday")) {
                    intent = new Intent(getContext(), Mon.class);
                }else if (sText.equals("Tuesday")) {
                    intent = new Intent(getContext(), Tue.class);
                }else if (sText.equals("Wednesday")) {
                    intent = new Intent(getContext(), Wed.class);
                }else if (sText.equals("Thursday")) {
                    intent = new Intent(getContext(), Thur.class);
                }else if (sText.equals("Friday")) {
                    intent = new Intent(getContext(), Fri.class);
                }else if (sText.equals("Saturday")) {
                    intent = new Intent(getContext(), Sat.class);
                }
                if (intent != null) {
                    startActivity(intent);
                }
            }
        });

        return rootview;
    }
}

