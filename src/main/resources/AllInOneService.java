import com.example.demo.pojo.News;
import com.example.demo.pojo.Type;

import java.util.List;


public interface AllInOneService {

	//查询所有分类名称
	List<Type> queryAllTypes();
	
	//根据分类查询新闻列表
	List<News> queryAllNewsListByType(int typeId);
	
	// 根据新闻id查询指定的新闻内容详情
	News queryNewsDetail(int newsId);
	
}
