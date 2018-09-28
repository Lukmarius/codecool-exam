package com.codecool.Model;

import java.util.ArrayList;

public class PersistenceDB {

    public ArrayList<MediaItem> findAllItems(){
        ArrayList<MediaItem> result = new ArrayList<>();

        Text text1 = new Text("Great Book", "Tom Hopkins", "1999");
        Audio audio1 = new Audio("Lovely Song", "The Bottles", "1958");
        Video video1 = new Video("Super Film", "John Purpose", "2010");

        result.add(text1);
        result.add(audio1);
        result.add(video1);

        return result;
    }

    public void saveList(ArrayList arrayList){

    }
}
