public class Codec {

    Map<Integer, String> map = new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int hash = longUrl.hashCode();
        map.put(hash, longUrl);
        return "http://tinyurl.com/" + hash;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int index = shortUrl.lastIndexOf("/");
        return map.get(Integer.parseInt(shortUrl.substring(index + 1)));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));




//Solution II:
public class Codec {

    Map<String, String> map = new HashMap<>();
    int count = 0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String shortUrl = "" + count;
        map.put(shortUrl, longUrl);
        count++;
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
