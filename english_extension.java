#JSGF V1.0 utf-8 en;

grammar music_play;

public <music_play> =
    (i want to listen to | [can you] (play [me] | put on)) <music_entity>;

<music_entity> =
    <genre> [music] |
    <album> by <artist> |
    <artist> |
    <song>;

<album> =
    ummagumma;

<genre> =
    jazz;

<artist> =
    beatles |
    radio head |
    cake |
    pink floyd;

<song> =
    confortably numb |
    paranoid android |
    let it be |
    hey jude;
