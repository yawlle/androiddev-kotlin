# androiddev-kotlin

Aplicação que mostra todos os títulos do subreddit /androiddev
- Utilização do Retrofit (melhor opção para uma API como essa do Reddit que os dados vem dentro de outros dados, precisando de desserialização).
- Utilização de RecycleView para mostrar ao usuário um conjunto de dados em forma de lista de itens. 
- Utilização do Gson, converte e desconverte objetos Java em JSON.

<b>TODO List</b>

- Activitys não tem obrigação de carregar lógica de requests. Procurar saber sobre MVVM e aplicar essa lógica em um componente separado. 
- Buscar formas de aplicar desserialização de API's utilizando Valley, ou alguma forma nativa e mais simples do que a utilizada (pois precisei fazer classes e mais classes para se adaptar a API). 
- Buscar saber se o Gson só converte objetos Java e se é saudável manter objetos Java dentro de um projeto Kotlin. 
