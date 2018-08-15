
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Magnetic - Stunning Responsive HTML5/CSS3 Photography Template</title>
	<meta charset="utf-8">
	<meta name="author" content="pixelhint.com">
	<meta name="description" content="Magnetic is a stunning responsive HTML5/CSS3 photography/portfolio website  template"/>
	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0" />
	<link rel="stylesheet" type="text/css" href="css/reset.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css">
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/main.js"></script>
</head>
<body>

	<%@include file="/WEB-INF/header-tag.jspf"%>

	<section class="main clearfix" >

		<section class="top2">	
			<div class="wrapper content_header clearfix">
				<div class="work_nav">
							
					<ul class="btn clearfix">
						<li><a href="index.html" class="grid" data-title="Portfolio"></a></li>
						<li><i class="fas fa-bookmark fa-lg" style="color: orange; border: 1px solid white; padding: 12.5px; background: white"></i></li>
					</ul>							
					
				</div><!-- end work_nav -->
                <h1 class="title">${bookVO.title} - ${bookVO.authorName}</h1>

			</div>		
		</section><!-- end top -->

		<section class="wrapper">
			<div class="content">
				<div style="width: 100%; height:auto;">
                    ${bookVO.content}
				</div>
			</div><!-- end content -->
		</section>
	</section><!-- end main -->
	
</body>
</html>