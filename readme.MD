# Cerence JSGF task

Simple CFG development in JSGF as part of Junghyun Min's interview process

## English grammar extension

My understanding of JSGF and its \<unk> tags are rudimentary. From what I've gathered from the documentation (linked in the pdf) and the explanations in the pdf, tokens without explicit mappings to a tag are tagged \<unk>. I have assumed so in my tasks.

I organized the generatable sentences into <play_request> <music_entity>, where <play_request> is implicitly defined as (i want to listen to | [can you] (play [me] | put on)).

The extended grammar is able to generate:

- [can you play]\<unk> [beatles]\<artist>
- [can you put on]\<unk> [paranoid android]\<song>
- [i want to listen to]\<unk> [jazz]\<genre> [music]\<unk>
- [play me]\<unk> [ummagumma]\<album> [by]\<unk> [pink floyd]\<artist>

As the model is scaled, it is likely that music entities also include phrases like "can you play", "want to listen", and other tokens that should be tagged \<unk>, parsing them as <music_entity>. Then, it may be beneficial to explicitly define <play_request> and have the model identify both <play_request> and <music_entity>. Tokens like [music] and [by] may also need to be explicitly defined.

## Korean localization

The localization explicitly defines <play_request> and introduces <want_listen>, which can be used as a request on its own but also can accompany <play_request>.

The localized grammar is able to generate:

- [비틀즈]<artist_ko> [재생해줘]<play_request>
- [파라노이드 안드로이드]<song_ko> [듣고싶어]<want_listen>
- [재즈]<genre_ko> [음악]\<unk> [듣고싶은데]<want_listen> [틀어줘]<play_request>
- [핑크플로이드]<artist_ko> [의]\<unk> [우마구마]<album_ko> [틀어줄 수 있니]<play_request>



