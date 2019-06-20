import java.util.List;
import com.example.demo.mapper.NewsMapper;
import com.example.demo.mapper.TypeMapper;
import com.example.demo.pojo.News;
import com.example.demo.pojo.Type;
import com.example.demo.service.AllInOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AllInOneServiceImpl implements AllInOneService {
	
	@Autowired
	private TypeMapper typeMapper;
	
	@Autowired
	private NewsMapper newsMapper;

	@Override
	public List<Type> queryAllTypes() {
		List<Type> lists = typeMapper.getAllTypes();
		return lists;
	}

	@Override
	public List<News> queryAllNewsListByType(int typeId) {
		System.out.println(typeId);
		List<News> newsList = newsMapper.getNewsListByTypeid(typeId);
        System.out.println(newsList);
		return newsList;
	}

	@Override
	public News queryNewsDetail(int newsId) {
		System.out.println(newsId);
		return newsMapper.getNewsByNewsId(newsId);
	}

}
