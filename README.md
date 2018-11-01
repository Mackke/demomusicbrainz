# demomusicbrainz

#info
In my application I have been using spring boot to launch my application because it's something I am more used to and
something I am currently working with at the company I am at right now. Also since I am a java programmer it makes more
sense to do the assignment in java.  

#NOTE 
Because of lack of time and some misunderstanding of the assignment everything
was not completed. The tests are not completed, aswell the coverimage of the albums
since I only managed to get one when I used that specific id for that specific image.
and when I used the MBID for the whole album and calling the CovertArtArchive it just gives me an error
and says that it not exist for that MBID though I used the right one. (tried this for several artist)
but still the same response. So for the sake of the solution I am just using one id in the request for a specific
imagecover id for that cover and not the mbid I was supposed to. So that the response we send back looks more like it
should but keep in mind that the image will be the same for all albums.


#instructions
To run the program go to Run -> Run Application.
To confirm that the api works add http://localhost:8080/getartistinfo
to your postman and make sure it's a post request your sending.


The response you should get should look something like this.
{
    "mbid": "ec2bcb77-b9a1-49e2-bfe7-419586bbef48",
    "title": "Big Bang",
    "description": "<p class=\"mw-empty-elt\">\n</p>\n\n<p class=\"mw-empty-elt\">\n</p>\n<p><b>Big Bang</b> (Hangul: <span lang=\"ko-Hang\" title=\"Korean language text\">빅뱅</span>) is a South Korean boy band formed by YG Entertainment. With members G-Dragon, T.O.P, Taeyang, Daesung, and Seungri, they are often cited as one of the most influential acts to shape the K-pop industry by helping spread the Korean Wave internationally and dubbed as  the \"Kings of K-pop\" by the media. Their experimental and diverse use of music genres, personal involvement in producing their own records, and stage performances have been admired by music critics and served as influence to numerous K-pop and international artists.</p><p>Despite their debut album, <i>Bigbang Vol.1</i> (2006), receiving lukewarm reception, success followed with a string of notable hits credited to the quintet, including \"Lies\" (Korean: <span lang=\"ko\" title=\"Korean language text\">거짓말</span>), which topped major Korean music charts for a record-breaking six consecutive weeks and won Song of the Year at the 2007 Mnet Km Music Festival and the 2008 Seoul Music Awards; \"Last Farewell\" (Korean: <span lang=\"ko\" title=\"Korean language text\">마지막 인사</span>); \"Day by Day\" (Korean: <span lang=\"ko\" title=\"Korean language text\">하루하루</span>); and \"Sunset Glow\" (Korean: <span lang=\"ko\" title=\"Korean language text\">붉은노을</span>). After receiving the Artist of the Year award from the 2008 Mnet Korean Music Festival and the 2008 Seoul Music Awards, the group expanded their endeavors to Japan, releasing four studio albums, <i>Big Bang</i> (2009), <i>Big Bang 2</i> (2011), <i>Alive</i> (2012), and <i>Made Series</i> (2016), which are all certified gold by the Recording Industry Association of Japan.\n</p><p>After a two-year hiatus in South Korea, the quintet produced increasingly innovative and critically acclaimed recordings. Their fourth EP, <i>Tonight</i> (2011), lead to their emergence as the inaugural Best Worldwide Act winner at the 2011 MTV Europe Music Awards. Their fifth EP, <i>Alive</i> (2012), became the first Korean album to chart on the <i>Billboard</i> 200. Their widely acclaimed third album, <i>Made</i> (2016), was preceded by several chart-topping singles, winning the group their third Artist of the Year award at the 2015 Mnet Asian Music Awards and their first at the 2015 Melon Music Awards. The supporting world tour gathered 1.5 million people in attendance, making it the most attended concert tour headlined by a Korean act in history.</p><p>Big Bang has a record of 18 number-one songs that have collectively remained atop South Korean's biggest online music service Melon for 51 weeks, more than any other act.  <i>Forbes Korea</i> ranked them as one of the most powerful celebrities in South Korea in 2010, 2012, 2013, 2014, and 2016. They were also the first Korean artists to enter <i>Forbes'</i> Celebrity 100 and the 30 under 30 list of most influential musicians in the world, in 2016 and 2017, respectively.</p>",
    "country": "KR",
    "albums": [
        {
            "title": "MADE",
            "id": "0d521add-b704-4801-8b5f-31b6b8687ccc",
            "image": "http://coverartarchive.org/release/1f11977b-09b2-4fee-a95b-d6c4a71f426b/15402712366.jpg"
        },
        {
            "title": "B I G B A N G 03",
            "id": "42c8d905-c626-3362-bb68-29f882e7fa9d",
            "image": "http://coverartarchive.org/release/1f11977b-09b2-4fee-a95b-d6c4a71f426b/15402712366.jpg"
        }      
}
