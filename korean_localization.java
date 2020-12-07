#JSGF V1.0 utf-8 ko;

grammar music_play_ko;

public <music_play_ko> =
    <music_entity_ko> (<want_listen> [<play_request>] | <play_request>);

<want_listen> = 듣고싶 ( -은데 | -어);

<play_request> = 재생해주 (-ㄹ 수 있니 | -어) |  틀어주 (-ㄹ 수 있니 | -어);

<music_entity_ko> =
    (<genre_ko> | <artist_ko>) [(음악 | 노래)] |
    <artist_ko> [의] (<album_ko> | <song_ko>) |
    <song_ko> |
    <artist_ko>;
    

<album_ko> =
    우마구마;

<genre_ko> =
    재즈;

<artist_ko> =
    비틀즈 |
    라디오헤드 |
    케이크 |
    핑크플로이드 ;

<song_ko> =
    컨포터블리 넘 |
    파라노이드 안드로이드 |
    렛잇비 |
    헤이 주드 ;
