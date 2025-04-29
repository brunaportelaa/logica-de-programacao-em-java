import java.lang.reflect.Field;
import java.util.ArrayList;

public class DatabaseDeputados {
    // Acre (AC) - Deputados Federais
    public static final Legislador antoniaLucia = new Legislador(Legislador.DEPT_FEDERAL, "Antônia Lucia", 10123, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.ACRE);
    public static final Legislador coronelUlysses = new Legislador(Legislador.DEPT_FEDERAL, "Coronel Ulysses", 44123, false, DatabasePartidos.UNIAO, DatabaseEstados.ACRE);
    public static final Legislador drEduardoVelloso = new Legislador(Legislador.DEPT_FEDERAL, "Dr Eduardo Velloso", 44145, false, DatabasePartidos.UNIAO, DatabaseEstados.ACRE);
    public static final Legislador gerlenDiniz = new Legislador(Legislador.DEPT_FEDERAL, "Gerlen Diniz", 11123, false, DatabasePartidos.PP, DatabaseEstados.ACRE);
    public static final Legislador meireSerafim = new Legislador(Legislador.DEPT_FEDERAL, "Meire Serafim", 44167, false, DatabasePartidos.UNIAO, DatabaseEstados.ACRE);
    public static final Legislador robertoDuarte = new Legislador(Legislador.DEPT_FEDERAL, "Roberto Duarte", 10145, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.ACRE);
    public static final Legislador socorroNeri = new Legislador(Legislador.DEPT_FEDERAL, "Socorro Neri", 11167, false, DatabasePartidos.PP, DatabaseEstados.ACRE);
    public static final Legislador zezinhoBarbary = new Legislador(Legislador.DEPT_FEDERAL, "Zezinho Barbary", 11189, false, DatabasePartidos.PP, DatabaseEstados.ACRE);

    // Alagoas (AL) - Deputados Federais
    public static final Legislador alfredoGaspar = new Legislador(Legislador.DEPT_FEDERAL, "Alfredo Gaspar", 44123, false, DatabasePartidos.UNIAO, DatabaseEstados.ALAGOAS);
    public static final Legislador arthurLira = new Legislador(Legislador.DEPT_FEDERAL, "Arthur Lira", 11123, true, DatabasePartidos.PP, DatabaseEstados.ALAGOAS);
    public static final Legislador danielBarbosa = new Legislador(Legislador.DEPT_FEDERAL, "Daniel Barbosa", 11145, false, DatabasePartidos.PP, DatabaseEstados.ALAGOAS);
    public static final Legislador delegadoFabioCosta = new Legislador(Legislador.DEPT_FEDERAL, "Delegado Fabio Costa", 11167, false, DatabasePartidos.PP, DatabaseEstados.ALAGOAS);
    public static final Legislador isnaldoBulhoesJr = new Legislador(Legislador.DEPT_FEDERAL, "Isnaldo Bulhões Jr", 15123, true, DatabasePartidos.MDB, DatabaseEstados.ALAGOAS);
    public static final Legislador lucianoAmaral = new Legislador(Legislador.DEPT_FEDERAL, "Luciano Amaral", 43123, false, DatabasePartidos.PV, DatabaseEstados.ALAGOAS);
    public static final Legislador marxBeltrao = new Legislador(Legislador.DEPT_FEDERAL, "Marx Beltrão", 11189, false, DatabasePartidos.PP, DatabaseEstados.ALAGOAS);
    public static final Legislador paulao = new Legislador(Legislador.DEPT_FEDERAL, "Paulão", 13123, true, DatabasePartidos.PT, DatabaseEstados.ALAGOAS);
    public static final Legislador rafaelBrito = new Legislador(Legislador.DEPT_FEDERAL, "Rafael Brito (Tio Rafa)", 15145, false, DatabasePartidos.MDB, DatabaseEstados.ALAGOAS);

    // Amazonas (AM) - Deputados Federais
    public static final Legislador atilaLins = new Legislador(Legislador.DEPT_FEDERAL, "Átila Lins", 55123, true, DatabasePartidos.PSD, DatabaseEstados.AMAZONAS);
    public static final Legislador capitaoAlbertoNeto = new Legislador(Legislador.DEPT_FEDERAL, "Capitão Alberto Neto", 22123, true, DatabasePartidos.PL, DatabaseEstados.AMAZONAS);
    public static final Legislador sidneyLeite = new Legislador(Legislador.DEPT_FEDERAL, "Sidney Leite", 55145, true, DatabasePartidos.PSD, DatabaseEstados.AMAZONAS);
    public static final Legislador silasCamara = new Legislador(Legislador.DEPT_FEDERAL, "Silas Câmara", 10123, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.AMAZONAS);
    public static final Legislador adailFilho = new Legislador(Legislador.DEPT_FEDERAL, "Adail Filho", 10145, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.AMAZONAS);
    public static final Legislador amomMandel = new Legislador(Legislador.DEPT_FEDERAL, "Amom Mandel", 23123, false, DatabasePartidos.CIDADANIA, DatabaseEstados.AMAZONAS);
    public static final Legislador faustoSantosJr = new Legislador(Legislador.DEPT_FEDERAL, "Fausto Santos Jr", 44123, false, DatabasePartidos.UNIAO, DatabaseEstados.AMAZONAS);
    public static final Legislador saulloVianna = new Legislador(Legislador.DEPT_FEDERAL, "Saullo Vianna", 44145, false, DatabasePartidos.UNIAO, DatabaseEstados.AMAZONAS);

    // Amapá (AP) - Deputados Federais
    public static final Legislador acacioFavacho = new Legislador(Legislador.DEPT_FEDERAL, "Acácio Favacho", 15123, true, DatabasePartidos.MDB, DatabaseEstados.AMAPA);
    public static final Legislador dorinaldoMalafaia = new Legislador(Legislador.DEPT_FEDERAL, "Dorinaldo Malafaia", 12123, false, DatabasePartidos.PDT, DatabaseEstados.AMAPA);
    public static final Legislador drPupio = new Legislador(Legislador.DEPT_FEDERAL, "Dr. Pupio", 15145, false, DatabasePartidos.MDB, DatabaseEstados.AMAPA);
    public static final Legislador josenildo = new Legislador(Legislador.DEPT_FEDERAL, "Josenildo", 12145, false, DatabasePartidos.PDT, DatabaseEstados.AMAPA);
    public static final Legislador professoraGoreth = new Legislador(Legislador.DEPT_FEDERAL, "Professora Goreth", 12167, false, DatabasePartidos.PDT, DatabaseEstados.AMAPA);
    public static final Legislador silviaWaiapi = new Legislador(Legislador.DEPT_FEDERAL, "Silvia Waiãpi", 22123, false, DatabasePartidos.PL, DatabaseEstados.AMAPA);
    public static final Legislador sonizeBarbosa = new Legislador(Legislador.DEPT_FEDERAL, "Sonize Barbosa", 22145, false, DatabasePartidos.PL, DatabaseEstados.AMAPA);
    public static final Legislador viniciusGurgel = new Legislador(Legislador.DEPT_FEDERAL, "Vinicius Gurgel", 22167, true, DatabasePartidos.PL, DatabaseEstados.AMAPA);

    // Bahia - Deputados Federais
    public static final Legislador adolfoViana = new Legislador(Legislador.DEPT_FEDERAL, "Adolfo Viana", 45123, true, DatabasePartidos.PSDB, DatabaseEstados.BAHIA);
    public static final Legislador afonsoFlorence = new Legislador(Legislador.DEPT_FEDERAL, "Afonso Florence", 13123, true, DatabasePartidos.PT, DatabaseEstados.BAHIA);
    public static final Legislador alexSantana = new Legislador(Legislador.DEPT_FEDERAL, "Alex Santana", 10123, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.BAHIA);
    public static final Legislador alicePortugal = new Legislador(Legislador.DEPT_FEDERAL, "Alice Portugal", 65123, true, DatabasePartidos.PCDOB, DatabaseEstados.BAHIA);
    public static final Legislador antonioBrito = new Legislador(Legislador.DEPT_FEDERAL, "Antonio Brito", 55123, true, DatabasePartidos.PSD, DatabaseEstados.BAHIA);
    public static final Legislador arthurMaia = new Legislador(Legislador.DEPT_FEDERAL, "Arthur Maia", 44123, true, DatabasePartidos.UNIAO, DatabaseEstados.BAHIA);
    public static final Legislador bacelar = new Legislador(Legislador.DEPT_FEDERAL, "Bacelar", 43123, true, DatabasePartidos.PV, DatabaseEstados.BAHIA);
    public static final Legislador capitaoAlden = new Legislador(Legislador.DEPT_FEDERAL, "Capitão Alden", 22123, false, DatabasePartidos.PL, DatabaseEstados.BAHIA);
    public static final Legislador claudioCajado = new Legislador(Legislador.DEPT_FEDERAL, "Claudio Cajado", 11123, true, DatabasePartidos.PP, DatabaseEstados.BAHIA);
    public static final Legislador daniel = new Legislador(Legislador.DEPT_FEDERAL, "Daniel", 65145, true, DatabasePartidos.PCDOB, DatabaseEstados.BAHIA);
    public static final Legislador deputadoDal = new Legislador(Legislador.DEPT_FEDERAL, "Deputado Dal", 44145, false, DatabasePartidos.UNIAO, DatabaseEstados.BAHIA);
    public static final Legislador diegoCoronel = new Legislador(Legislador.DEPT_FEDERAL, "Diego Coronel", 55145, false, DatabasePartidos.PSD, DatabaseEstados.BAHIA);
    public static final Legislador elmarNascimento = new Legislador(Legislador.DEPT_FEDERAL, "Elmar Nascimento", 44167, true, DatabasePartidos.UNIAO, DatabaseEstados.BAHIA);
    public static final Legislador felixMendonca = new Legislador(Legislador.DEPT_FEDERAL, "Felix Mendonça", 12123, true, DatabasePartidos.PDT, DatabaseEstados.BAHIA);
    public static final Legislador gabrielNunes = new Legislador(Legislador.DEPT_FEDERAL, "Gabriel Nunes", 55167, false, DatabasePartidos.PSD, DatabaseEstados.BAHIA);
    public static final Legislador ivoneideCaetano = new Legislador(Legislador.DEPT_FEDERAL, "Ivoneide Caetano", 13145, false, DatabasePartidos.PT, DatabaseEstados.BAHIA);
    public static final Legislador joaoCarlosBacelar = new Legislador(Legislador.DEPT_FEDERAL, "João Carlos Bacelar", 22145, true, DatabasePartidos.PL, DatabaseEstados.BAHIA);
    public static final Legislador joaoLeao = new Legislador(Legislador.DEPT_FEDERAL, "João Leão", 11145, false, DatabasePartidos.PP, DatabaseEstados.BAHIA);
    public static final Legislador jorgeSolla = new Legislador(Legislador.DEPT_FEDERAL, "Jorge Solla", 13167, true, DatabasePartidos.PT, DatabaseEstados.BAHIA);
    public static final Legislador joseRocha = new Legislador(Legislador.DEPT_FEDERAL, "José Rocha", 44189, false, DatabasePartidos.UNIAO, DatabaseEstados.BAHIA);
    public static final Legislador joseildoRamos = new Legislador(Legislador.DEPT_FEDERAL, "Joseildo Ramos", 13189, true, DatabasePartidos.PT, DatabaseEstados.BAHIA);
    public static final Legislador leoPrates = new Legislador(Legislador.DEPT_FEDERAL, "Léo Prates", 12145, false, DatabasePartidos.PDT, DatabaseEstados.BAHIA);
    public static final Legislador leurLomantoJr = new Legislador(Legislador.DEPT_FEDERAL, "Leur Lomanto Jr", 44201, true, DatabasePartidos.UNIAO, DatabaseEstados.BAHIA);
    public static final Legislador lidiceDaMata = new Legislador(Legislador.DEPT_FEDERAL, "Lídice da Mata", 40123, true, DatabasePartidos.PSB, DatabaseEstados.BAHIA);
    public static final Legislador marcioMarinho = new Legislador(Legislador.DEPT_FEDERAL, "Marcio Marinho", 10145, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.BAHIA);
    public static final Legislador marioNegromonteJr = new Legislador(Legislador.DEPT_FEDERAL, "Mário Negromonte Jr", 11167, true, DatabasePartidos.PP, DatabaseEstados.BAHIA);
    public static final Legislador netoCarletto = new Legislador(Legislador.DEPT_FEDERAL, "Neto Carletto", 11189, false, DatabasePartidos.PP, DatabaseEstados.BAHIA);
    public static final Legislador ottoFilho = new Legislador(Legislador.DEPT_FEDERAL, "Otto Filho", 55189, true, DatabasePartidos.PSD, DatabaseEstados.BAHIA);
    public static final Legislador pastorSargentoIsidorio = new Legislador(Legislador.DEPT_FEDERAL, "Pastor Sargento Isidório", 70123, true, DatabasePartidos.AVANTE, DatabaseEstados.BAHIA);
    public static final Legislador pauloAzi = new Legislador(Legislador.DEPT_FEDERAL, "Paulo Azi", 44223, true, DatabasePartidos.UNIAO, DatabaseEstados.BAHIA);
    public static final Legislador pauloMagalhaes = new Legislador(Legislador.DEPT_FEDERAL, "Paulo Magalhães", 55201, true, DatabasePartidos.PSD, DatabaseEstados.BAHIA);
    public static final Legislador raimundoCosta = new Legislador(Legislador.DEPT_FEDERAL, "Raimundo Costa", 19123, true, DatabasePartidos.PODE, DatabaseEstados.BAHIA);
    public static final Legislador ricardoMaia = new Legislador(Legislador.DEPT_FEDERAL, "Ricardo Maia", 15123, false, DatabasePartidos.MDB, DatabaseEstados.BAHIA);
    public static final Legislador robertaRoma = new Legislador(Legislador.DEPT_FEDERAL, "Roberta Roma", 22167, false, DatabasePartidos.PL, DatabaseEstados.BAHIA);
    public static final Legislador rogeriaSantos = new Legislador(Legislador.DEPT_FEDERAL, "Rogería Santos", 10167, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.BAHIA);
    public static final Legislador sergioBrito = new Legislador(Legislador.DEPT_FEDERAL, "Sérgio Brito", 55223, true, DatabasePartidos.PSD, DatabaseEstados.BAHIA);
    public static final Legislador valmirAssuncao = new Legislador(Legislador.DEPT_FEDERAL, "Valmir Assunção", 13201, true, DatabasePartidos.PT, DatabaseEstados.BAHIA);
    public static final Legislador waldenorPereira = new Legislador(Legislador.DEPT_FEDERAL, "Waldenor Pereira", 13223, true, DatabasePartidos.PT, DatabaseEstados.BAHIA);
    public static final Legislador zeNeto = new Legislador(Legislador.DEPT_FEDERAL, "Zé Neto", 13245, true, DatabasePartidos.PT, DatabaseEstados.BAHIA);

    // Ceará - Deputados Federais
    public static final Legislador ajAlbuquerque = new Legislador(Legislador.DEPT_FEDERAL, "AJ Albuquerque", 11123, true, DatabasePartidos.PP, DatabaseEstados.CEARA);
    public static final Legislador andreFernandes = new Legislador(Legislador.DEPT_FEDERAL, "André Fernandes", 22123, false, DatabasePartidos.PL, DatabaseEstados.CEARA);
    public static final Legislador andreFigueiredo = new Legislador(Legislador.DEPT_FEDERAL, "André Figueiredo", 12123, true, DatabasePartidos.PDT, DatabaseEstados.CEARA);
    public static final Legislador celioStudart = new Legislador(Legislador.DEPT_FEDERAL, "Célio Studart", 55123, true, DatabasePartidos.PSD, DatabaseEstados.CEARA);
    public static final Legislador daniloForte = new Legislador(Legislador.DEPT_FEDERAL, "Danilo Forte", 44123, true, DatabasePartidos.UNIAO, DatabaseEstados.CEARA);
    public static final Legislador dayanyDoCapitao = new Legislador(Legislador.DEPT_FEDERAL, "Dayany do Capitão", 44145, false, DatabasePartidos.UNIAO, DatabaseEstados.CEARA);
    public static final Legislador domingosNeto = new Legislador(Legislador.DEPT_FEDERAL, "Domingos Neto", 55145, true, DatabasePartidos.PSD, DatabaseEstados.CEARA);
    public static final Legislador drJaziel = new Legislador(Legislador.DEPT_FEDERAL, "Dr. Jaziel", 22145, true, DatabasePartidos.PL, DatabaseEstados.CEARA);
    public static final Legislador eduardoBismarck = new Legislador(Legislador.DEPT_FEDERAL, "Eduardo Bismarck", 12145, true, DatabasePartidos.PDT, DatabaseEstados.CEARA);
    public static final Legislador eunicio = new Legislador(Legislador.DEPT_FEDERAL, "Eunício", 15123, false, DatabasePartidos.MDB, DatabaseEstados.CEARA);
    public static final Legislador fernandaPessoa = new Legislador(Legislador.DEPT_FEDERAL, "Fernanda Pessoa", 44167, false, DatabasePartidos.UNIAO, DatabaseEstados.CEARA);
    public static final Legislador guimaraesDoPt = new Legislador(Legislador.DEPT_FEDERAL, "Guimarães do PT", 13123, true, DatabasePartidos.PT, DatabaseEstados.CEARA);
    public static final Legislador idilvan = new Legislador(Legislador.DEPT_FEDERAL, "Idilvan", 12167, true, DatabasePartidos.PDT, DatabaseEstados.CEARA);
    public static final Legislador joseAirton = new Legislador(Legislador.DEPT_FEDERAL, "José Airton", 13145, true, DatabasePartidos.PT, DatabaseEstados.CEARA);
    public static final Legislador juniorMano = new Legislador(Legislador.DEPT_FEDERAL, "Júnior Mano", 22167, true, DatabasePartidos.PL, DatabaseEstados.CEARA);
    public static final Legislador luizGastao = new Legislador(Legislador.DEPT_FEDERAL, "Luiz Gastão", 55167, false, DatabasePartidos.PSD, DatabaseEstados.CEARA);
    public static final Legislador luizianneLins = new Legislador(Legislador.DEPT_FEDERAL, "Luizianne Lins", 13167, true, DatabasePartidos.PT, DatabaseEstados.CEARA);
    public static final Legislador matheusNoronha = new Legislador(Legislador.DEPT_FEDERAL, "Matheus Noronha", 22189, false, DatabasePartidos.PL, DatabaseEstados.CEARA);
    public static final Legislador mauroFilho = new Legislador(Legislador.DEPT_FEDERAL, "Mauro Filho", 12189, true, DatabasePartidos.PDT, DatabaseEstados.CEARA);
    public static final Legislador mosesRodrigues = new Legislador(Legislador.DEPT_FEDERAL, "Moses Rodrigues", 44189, true, DatabasePartidos.UNIAO, DatabaseEstados.CEARA);
    public static final Legislador roberioMonteiro = new Legislador(Legislador.DEPT_FEDERAL, "Robério Monteiro", 12201, true, DatabasePartidos.PDT, DatabaseEstados.CEARA);
    public static final Legislador yuryDoParedao = new Legislador(Legislador.DEPT_FEDERAL, "Yury do Paredão", 22201, false, DatabasePartidos.PL, DatabaseEstados.CEARA);

    // Distrito Federal (DF)
    public static final Legislador biaKicis = new Legislador(Legislador.DEPT_FEDERAL, "Bia Kicis", 22123, true, DatabasePartidos.PL, DatabaseEstados.DISTRITO_FEDERAL);
    public static final Legislador erikaKokay = new Legislador(Legislador.DEPT_FEDERAL, "Erika Kokay", 13123, true, DatabasePartidos.PT, DatabaseEstados.DISTRITO_FEDERAL);
    public static final Legislador fraga = new Legislador(Legislador.DEPT_FEDERAL, "Fraga", 22145, false, DatabasePartidos.PL, DatabaseEstados.DISTRITO_FEDERAL);
    public static final Legislador fredLinhares = new Legislador(Legislador.DEPT_FEDERAL, "Fred Linhares", 10123, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.DISTRITO_FEDERAL);
    public static final Legislador gilvanMaximo = new Legislador(Legislador.DEPT_FEDERAL, "Gilvan Máximo", 10145, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.DISTRITO_FEDERAL);
    public static final Legislador julioCesar = new Legislador(Legislador.DEPT_FEDERAL, "Júlio Cesar", 10167, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.DISTRITO_FEDERAL);
    public static final Legislador professorReginaldoVeras = new Legislador(Legislador.DEPT_FEDERAL, "Professor Reginaldo Veras", 43123, false, DatabasePartidos.PV, DatabaseEstados.DISTRITO_FEDERAL);
    public static final Legislador rafaelPrudente = new Legislador(Legislador.DEPT_FEDERAL, "Rafael Prudente", 15123, false, DatabasePartidos.MDB, DatabaseEstados.DISTRITO_FEDERAL);

    // Espírito Santo (ES) - Deputados Federais (categoria 2)
    public static final Legislador amaroNeto = new Legislador(Legislador.DEPT_FEDERAL, "Amaro Neto", 10123, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.ESPIRITO_SANTO);
    public static final Legislador daVitoria = new Legislador(Legislador.DEPT_FEDERAL, "Da Vitória", 11123, true, DatabasePartidos.PP, DatabaseEstados.ESPIRITO_SANTO);
    public static final Legislador drVictor = new Legislador(Legislador.DEPT_FEDERAL, "Dr. Victor", 19123, false, DatabasePartidos.PODE, DatabaseEstados.ESPIRITO_SANTO);
    public static final Legislador evairDeMelo = new Legislador(Legislador.DEPT_FEDERAL, "Evair de Melo", 11145, true, DatabasePartidos.PP, DatabaseEstados.ESPIRITO_SANTO);
    public static final Legislador gilsonDaniel = new Legislador(Legislador.DEPT_FEDERAL, "Gilson Daniel", 19145, false, DatabasePartidos.PODE, DatabaseEstados.ESPIRITO_SANTO);
    public static final Legislador gilvanOFederalDaDireita = new Legislador(Legislador.DEPT_FEDERAL, "Gilvan O Federal da Direita", 22123, false, DatabasePartidos.PL, DatabaseEstados.ESPIRITO_SANTO);
    public static final Legislador helderSalomao = new Legislador(Legislador.DEPT_FEDERAL, "Helder Salomão", 13123, true, DatabasePartidos.PT, DatabaseEstados.ESPIRITO_SANTO);
    public static final Legislador jackRocha = new Legislador(Legislador.DEPT_FEDERAL, "Jack Rocha", 13145, false, DatabasePartidos.PT, DatabaseEstados.ESPIRITO_SANTO);
    public static final Legislador messiasDonato = new Legislador(Legislador.DEPT_FEDERAL, "Messias Donato", 10145, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.ESPIRITO_SANTO);
    public static final Legislador pauloFoleto = new Legislador(Legislador.DEPT_FEDERAL, "Paulo Foleto", 40123, true, DatabasePartidos.PSB, DatabaseEstados.ESPIRITO_SANTO);

    // Goiás (GO) - Deputados Federais (categoria 2)
    public static final Legislador adrianoDoBaldy = new Legislador(Legislador.DEPT_FEDERAL, "Adriano do Baldy", 11123, true, DatabasePartidos.PP, DatabaseEstados.GOIAS);
    public static final Legislador celioSilveira = new Legislador(Legislador.DEPT_FEDERAL, "Célio Silveira", 15123, true, DatabasePartidos.MDB, DatabaseEstados.GOIAS);
    public static final Legislador danielAgrobom = new Legislador(Legislador.DEPT_FEDERAL, "Daniel Agrobom", 22123, false, DatabasePartidos.PL, DatabaseEstados.GOIAS);
    public static final Legislador delegadaAdrianaAccorsi = new Legislador(Legislador.DEPT_FEDERAL, "Delegada Adriana Accorsi", 13123, false, DatabasePartidos.PT, DatabaseEstados.GOIAS);
    public static final Legislador drIsmaelAlexandrino = new Legislador(Legislador.DEPT_FEDERAL, "Dr. Ismael Alexandrino", 55123, false, DatabasePartidos.PSD, DatabaseEstados.GOIAS);
    public static final Legislador drZachariasCalil = new Legislador(Legislador.DEPT_FEDERAL, "Dr. Zacharias Calil", 44123, true, DatabasePartidos.UNIAO, DatabaseEstados.GOIAS);
    public static final Legislador flaviaMorais = new Legislador(Legislador.DEPT_FEDERAL, "Flávia Morais", 12123, true, DatabasePartidos.PDT, DatabaseEstados.GOIAS);
    public static final Legislador glaucinDaFokus = new Legislador(Legislador.DEPT_FEDERAL, "Glaustin da Fokus", 20123, true, DatabasePartidos.PSC, DatabaseEstados.GOIAS);
    public static final Legislador gustavoGayer = new Legislador(Legislador.DEPT_FEDERAL, "Gustavo Gayer", 22145, false, DatabasePartidos.PL, DatabaseEstados.GOIAS);
    public static final Legislador jefersonRodrigues = new Legislador(Legislador.DEPT_FEDERAL, "Jeferson Rodrigues", 10123, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.GOIAS);
    public static final Legislador joseNelto = new Legislador(Legislador.DEPT_FEDERAL, "José Nelto", 11145, true, DatabasePartidos.PP, DatabaseEstados.GOIAS);
    public static final Legislador ledaBorges = new Legislador(Legislador.DEPT_FEDERAL, "Lêda Borges", 45123, false, DatabasePartidos.PSDB, DatabaseEstados.GOIAS);
    public static final Legislador magdaMofatto = new Legislador(Legislador.DEPT_FEDERAL, "Magda Mofatto", 22167, true, DatabasePartidos.PL, DatabaseEstados.GOIAS);
    public static final Legislador marussaBoldrin = new Legislador(Legislador.DEPT_FEDERAL, "Marussa Boldrin", 15145, false, DatabasePartidos.MDB, DatabaseEstados.GOIAS);
    public static final Legislador professorAlcides = new Legislador(Legislador.DEPT_FEDERAL, "Professor Alcides", 22189, true, DatabasePartidos.PL, DatabaseEstados.GOIAS);
    public static final Legislador rubensOtoni = new Legislador(Legislador.DEPT_FEDERAL, "Rubens Otoni", 13145, true, DatabasePartidos.PT, DatabaseEstados.GOIAS);
    public static final Legislador silvyeAlves = new Legislador(Legislador.DEPT_FEDERAL, "Silvye Alves", 44145, false, DatabasePartidos.UNIAO, DatabaseEstados.GOIAS);

    // Maranhão (MA) - Deputados Federais (categoria 2)
    public static final Legislador aluisioMendes = new Legislador(Legislador.DEPT_FEDERAL, "Aluisio Mendes", 20123, true, DatabasePartidos.PSC, DatabaseEstados.MARANHAO);
    public static final Legislador amandaGentil = new Legislador(Legislador.DEPT_FEDERAL, "Amanda Gentil", 11123, false, DatabasePartidos.PP, DatabaseEstados.MARANHAO);
    public static final Legislador andreFufuca = new Legislador(Legislador.DEPT_FEDERAL, "André Fufuca", 11145, true, DatabasePartidos.PP, DatabaseEstados.MARANHAO);
    public static final Legislador cleberVerde = new Legislador(Legislador.DEPT_FEDERAL, "Cleber Verde", 10123, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.MARANHAO);
    public static final Legislador detinha = new Legislador(Legislador.DEPT_FEDERAL, "Detinha", 22123, false, DatabasePartidos.PL, DatabaseEstados.MARANHAO);
    public static final Legislador duarte = new Legislador(Legislador.DEPT_FEDERAL, "Duarte", 40123, false, DatabasePartidos.PSB, DatabaseEstados.MARANHAO);
    public static final Legislador fabioMacedo = new Legislador(Legislador.DEPT_FEDERAL, "Fábio Macedo", 19123, false, DatabasePartidos.PODE, DatabaseEstados.MARANHAO);
    public static final Legislador josimarMaranhaozinho = new Legislador(Legislador.DEPT_FEDERAL, "Josimar Maranhãozinho", 22145, true, DatabasePartidos.PL, DatabaseEstados.MARANHAO);
    public static final Legislador josivaldoJp = new Legislador(Legislador.DEPT_FEDERAL, "Josivaldo JP", 55123, true, DatabasePartidos.PSD, DatabaseEstados.MARANHAO);
    public static final Legislador juniorLourenco = new Legislador(Legislador.DEPT_FEDERAL, "Júnior Lourenço", 22167, true, DatabasePartidos.PL, DatabaseEstados.MARANHAO);
    public static final Legislador juscelinoFilho = new Legislador(Legislador.DEPT_FEDERAL, "Juscelino Filho", 44123, true, DatabasePartidos.UNIAO, DatabaseEstados.MARANHAO);
    public static final Legislador marcioHonaiser = new Legislador(Legislador.DEPT_FEDERAL, "Márcio Honaiser", 12123, false, DatabasePartidos.PDT, DatabaseEstados.MARANHAO);
    public static final Legislador marcioJerry = new Legislador(Legislador.DEPT_FEDERAL, "Marcio Jerry", 65123, true, DatabasePartidos.PCDOB, DatabaseEstados.MARANHAO);
    public static final Legislador marrecaFilho = new Legislador(Legislador.DEPT_FEDERAL, "Marreca Filho", 51123, true, DatabasePartidos.PATRIOTA, DatabaseEstados.MARANHAO);
    public static final Legislador pastorGil = new Legislador(Legislador.DEPT_FEDERAL, "Pastor Gil", 22189, true, DatabasePartidos.PL, DatabaseEstados.MARANHAO);
    public static final Legislador pedroLucasFernandes = new Legislador(Legislador.DEPT_FEDERAL, "Pedro Lucas Fernandes", 44145, true, DatabasePartidos.UNIAO, DatabaseEstados.MARANHAO);
    public static final Legislador roseanaSarney = new Legislador(Legislador.DEPT_FEDERAL, "Roseana Sarney", 15123, false, DatabasePartidos.MDB, DatabaseEstados.MARANHAO);
    public static final Legislador rubensPereiraJr = new Legislador(Legislador.DEPT_FEDERAL, "Rubens Pereira Jr", 13123, true, DatabasePartidos.PT, DatabaseEstados.MARANHAO);

    // Minas Gerais (MG) - Deputados Federais
    public static final Legislador aecioNeves = new Legislador(Legislador.DEPT_FEDERAL, "Aécio Neves", 45123, true, DatabasePartidos.PSDB, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador anaPaulaJunqueiraLeao = new Legislador(Legislador.DEPT_FEDERAL, "Ana Paula Junqueira Leão", 11123, false, DatabasePartidos.PP, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador anaPimentel = new Legislador(Legislador.DEPT_FEDERAL, "Ana Pimentel", 13123, false, DatabasePartidos.PT, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador andreJanones = new Legislador(Legislador.DEPT_FEDERAL, "André Janones", 70123, true, DatabasePartidos.AVANTE, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador brunoFarias = new Legislador(Legislador.DEPT_FEDERAL, "Bruno Farias", 70145, false, DatabasePartidos.AVANTE, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador celiaXakriaba = new Legislador(Legislador.DEPT_FEDERAL, "Célia Xakriabá", 50123, false, DatabasePartidos.PSOL, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador dandara = new Legislador(Legislador.DEPT_FEDERAL, "Dandara", 13145, false, DatabasePartidos.PT, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador delegadaIoneBarbosa = new Legislador(Legislador.DEPT_FEDERAL, "Delegada Ione Barbosa", 70167, false, DatabasePartidos.AVANTE, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador delegadoMarceloFreitas = new Legislador(Legislador.DEPT_FEDERAL, "Delegado Marcelo Freitas", 44123, true, DatabasePartidos.UNIAO, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador diegoAndrade = new Legislador(Legislador.DEPT_FEDERAL, "Diego Andrade", 55123, true, DatabasePartidos.PSD, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador dimasFabiano = new Legislador(Legislador.DEPT_FEDERAL, "Dimas Fabiano", 11145, true, DatabasePartidos.PP, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador domingosSavio = new Legislador(Legislador.DEPT_FEDERAL, "Domingos Sávio", 22123, true, DatabasePartidos.PL, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador drMarioHeringer = new Legislador(Legislador.DEPT_FEDERAL, "Dr. Mário Heringer", 12123, true, DatabasePartidos.PDT, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador drFrederico = new Legislador(Legislador.DEPT_FEDERAL, "Dr. Frederico", 51123, true, DatabasePartidos.PATRIOTA, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador dudaSalabert = new Legislador(Legislador.DEPT_FEDERAL, "Duda Salabert", 12145, false, DatabasePartidos.PDT, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador emidinhoMadeira = new Legislador(Legislador.DEPT_FEDERAL, "Emidinho Madeira", 22145, true, DatabasePartidos.PL, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador erosBiondini = new Legislador(Legislador.DEPT_FEDERAL, "Eros Biondini", 22167, true, DatabasePartidos.PL, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador euclydesPettersen = new Legislador(Legislador.DEPT_FEDERAL, "Euclydes Pettersen", 20123, true, DatabasePartidos.PSC, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador fredCosta = new Legislador(Legislador.DEPT_FEDERAL, "Fred Costa", 51145, true, DatabasePartidos.PATRIOTA, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador gilbertoAbramo = new Legislador(Legislador.DEPT_FEDERAL, "Gilberto Abramo", 10123, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador greyceElias = new Legislador(Legislador.DEPT_FEDERAL, "Greyce Elias", 70189, true, DatabasePartidos.AVANTE, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador hercilioCoelhoDiniz = new Legislador(Legislador.DEPT_FEDERAL, "Hercílio Coelho Diniz", 15123, true, DatabasePartidos.MDB, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador igorTimo = new Legislador(Legislador.DEPT_FEDERAL, "Igor Timo", 19123, true, DatabasePartidos.PODE, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador junioAmaral = new Legislador(Legislador.DEPT_FEDERAL, "Junio Amaral", 22189, true, DatabasePartidos.PL, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador lafayetteAndrada = new Legislador(Legislador.DEPT_FEDERAL, "Lafayette Andrada", 10145, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador leonardoMonteiro = new Legislador(Legislador.DEPT_FEDERAL, "Leonardo Monteiro", 13167, true, DatabasePartidos.PT, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador lincolnPortela = new Legislador(Legislador.DEPT_FEDERAL, "Lincoln Portela", 22201, true, DatabasePartidos.PL, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador luisTibe = new Legislador(Legislador.DEPT_FEDERAL, "Luis Tibé", 70201, true, DatabasePartidos.AVANTE, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador luizFernando = new Legislador(Legislador.DEPT_FEDERAL, "Luiz Fernando", 55145, false, DatabasePartidos.PSD, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador marceloAlvaroAntonio = new Legislador(Legislador.DEPT_FEDERAL, "Marcelo Álvaro Antônio", 22223, true, DatabasePartidos.PL, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador mauricioDoVolei = new Legislador(Legislador.DEPT_FEDERAL, "Mauricio do Vôlei", 22245, false, DatabasePartidos.PL, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador miguelAngelo = new Legislador(Legislador.DEPT_FEDERAL, "Miguel Ângelo", 13189, false, DatabasePartidos.PT, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador misaelVarella = new Legislador(Legislador.DEPT_FEDERAL, "Misael Varella", 55167, true, DatabasePartidos.PSD, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador nelyAquino = new Legislador(Legislador.DEPT_FEDERAL, "Nely Aquino", 19145, false, DatabasePartidos.PODE, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador newtonCardosoJr = new Legislador(Legislador.DEPT_FEDERAL, "Newton Cardoso Jr", 15145, true, DatabasePartidos.MDB, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador nikolasFerreira = new Legislador(Legislador.DEPT_FEDERAL, "Nikolas Ferreira", 22267, false, DatabasePartidos.PL, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador odairCunha = new Legislador(Legislador.DEPT_FEDERAL, "Odair Cunha", 13201, true, DatabasePartidos.PT, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador padreJoao = new Legislador(Legislador.DEPT_FEDERAL, "Padre João", 13223, true, DatabasePartidos.PT, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador patrusAnanias = new Legislador(Legislador.DEPT_FEDERAL, "Patrus Ananias", 13245, true, DatabasePartidos.PT, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador pauloAbiAckel = new Legislador(Legislador.DEPT_FEDERAL, "Paulo Abi-Ackel", 45145, true, DatabasePartidos.PSDB, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador pauloGuedes = new Legislador(Legislador.DEPT_FEDERAL, "Paulo Guedes", 13267, true, DatabasePartidos.PT, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador pedroAihara = new Legislador(Legislador.DEPT_FEDERAL, "Pedro Aihara", 51167, false, DatabasePartidos.PATRIOTA, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador pinheirinho = new Legislador(Legislador.DEPT_FEDERAL, "Pinheirinho", 11167, true, DatabasePartidos.PP, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador rafaelSimoes = new Legislador(Legislador.DEPT_FEDERAL, "Rafael Simões", 44145, false, DatabasePartidos.UNIAO, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador reginaldoLopes = new Legislador(Legislador.DEPT_FEDERAL, "Reginaldo Lopes", 13289, true, DatabasePartidos.PT, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador rodrigoDeCastro = new Legislador(Legislador.DEPT_FEDERAL, "Rodrigo de Castro", 44167, true, DatabasePartidos.UNIAO, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador rogerioCorreia = new Legislador(Legislador.DEPT_FEDERAL, "Rogério Correia", 13301, true, DatabasePartidos.PT, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador rosangelaReis = new Legislador(Legislador.DEPT_FEDERAL, "Rosângela Reis", 22289, false, DatabasePartidos.PL, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador samuelViana = new Legislador(Legislador.DEPT_FEDERAL, "Samuel Viana", 22301, false, DatabasePartidos.PL, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador stefanoAguiar = new Legislador(Legislador.DEPT_FEDERAL, "Stefano Aguiar", 55189, true, DatabasePartidos.PSD, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador welitonPrado = new Legislador(Legislador.DEPT_FEDERAL, "Weliton Prado", 90123, true, DatabasePartidos.PROS, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador zeSilva = new Legislador(Legislador.DEPT_FEDERAL, "Zé Silva", 77123, true, DatabasePartidos.SOLIDARIEDADE, DatabaseEstados.MINAS_GERAIS);
    public static final Legislador zeVitor = new Legislador(Legislador.DEPT_FEDERAL, "Zé Vitor", 22323, true, DatabasePartidos.PL, DatabaseEstados.MINAS_GERAIS);


    // Mato Grosso do Sul (MS) - Deputados Federais (categoria 2)
    public static final Legislador betoPereira = new Legislador(Legislador.DEPT_FEDERAL, "Beto Pereira", 45123, true, DatabasePartidos.PSDB, DatabaseEstados.MATO_GROSSO_DO_SUL);
    public static final Legislador camilaJara = new Legislador(Legislador.DEPT_FEDERAL, "Camila Jara", 13123, false, DatabasePartidos.PT, DatabaseEstados.MATO_GROSSO_DO_SUL);
    public static final Legislador dagoberto = new Legislador(Legislador.DEPT_FEDERAL, "Dagoberto", 45145, true, DatabasePartidos.PSDB, DatabaseEstados.MATO_GROSSO_DO_SUL);
    public static final Legislador drGeraldoResende = new Legislador(Legislador.DEPT_FEDERAL, "Dr. Geraldo Resende", 45167, true, DatabasePartidos.PSDB, DatabaseEstados.MATO_GROSSO_DO_SUL);
    public static final Legislador drLuizOvando = new Legislador(Legislador.DEPT_FEDERAL, "Dr. Luiz Ovando", 11123, true, DatabasePartidos.PP, DatabaseEstados.MATO_GROSSO_DO_SUL);
    public static final Legislador marcosPollon = new Legislador(Legislador.DEPT_FEDERAL, "Marcos Pollon", 22123, false, DatabasePartidos.PL, DatabaseEstados.MATO_GROSSO_DO_SUL);
    public static final Legislador rodolfoNogueira = new Legislador(Legislador.DEPT_FEDERAL, "Rodolfo Nogueira", 22145, false, DatabasePartidos.PL, DatabaseEstados.MATO_GROSSO_DO_SUL);
    public static final Legislador vanderLoubet = new Legislador(Legislador.DEPT_FEDERAL, "Vander Loubet", 13145, true, DatabasePartidos.PT, DatabaseEstados.MATO_GROSSO_DO_SUL);

    // Mato Grosso (MT) - Deputados Federais (categoria 2)
    public static final Legislador abilio = new Legislador(Legislador.DEPT_FEDERAL, "Abílio", 22123, false, DatabasePartidos.PL, DatabaseEstados.MATO_GROSSO);
    public static final Legislador amaliaBarros = new Legislador(Legislador.DEPT_FEDERAL, "Amália Barros", 22145, false, DatabasePartidos.PL, DatabaseEstados.MATO_GROSSO);
    public static final Legislador coronelAssis = new Legislador(Legislador.DEPT_FEDERAL, "Coronel Assis", 44123, false, DatabasePartidos.UNIAO, DatabaseEstados.MATO_GROSSO);
    public static final Legislador coronelFernanda = new Legislador(Legislador.DEPT_FEDERAL, "Coronel Fernanda", 22167, false, DatabasePartidos.PL, DatabaseEstados.MATO_GROSSO);
    public static final Legislador emanuelzinho = new Legislador(Legislador.DEPT_FEDERAL, "Emanuelzinho", 15123, true, DatabasePartidos.MDB, DatabaseEstados.MATO_GROSSO);
    public static final Legislador fabioGarcia = new Legislador(Legislador.DEPT_FEDERAL, "Fábio Garcia", 44145, false, DatabasePartidos.UNIAO, DatabaseEstados.MATO_GROSSO);
    public static final Legislador joseMedeiros = new Legislador(Legislador.DEPT_FEDERAL, "José Medeiros", 22189, true, DatabasePartidos.PL, DatabaseEstados.MATO_GROSSO);
    public static final Legislador juarezCosta = new Legislador(Legislador.DEPT_FEDERAL, "Juarez Costa", 15145, true, DatabasePartidos.MDB, DatabaseEstados.MATO_GROSSO);

    // Pará (PA) - Deputados Federais (categoria 2)
    public static final Legislador airtonFaleiro = new Legislador(Legislador.DEPT_FEDERAL, "Airton Faleiro", 13123, true, DatabasePartidos.PT, DatabaseEstados.PARA);
    public static final Legislador andreiaSiqueira = new Legislador(Legislador.DEPT_FEDERAL, "Andreia Siqueira", 15123, false, DatabasePartidos.MDB, DatabaseEstados.PARA);
    public static final Legislador antonioDoido = new Legislador(Legislador.DEPT_FEDERAL, "Antonio Doido", 15145, false, DatabasePartidos.MDB, DatabaseEstados.PARA);
    public static final Legislador celsoSabino = new Legislador(Legislador.DEPT_FEDERAL, "Celso Sabino", 44123, true, DatabasePartidos.UNIAO, DatabaseEstados.PARA);
    public static final Legislador delegadoCaveira = new Legislador(Legislador.DEPT_FEDERAL, "Delegado Caveira", 22123, false, DatabasePartidos.PL, DatabaseEstados.PARA);
    public static final Legislador delegadoEderMauro = new Legislador(Legislador.DEPT_FEDERAL, "Delegado Eder Mauro", 22145, true, DatabasePartidos.PL, DatabaseEstados.PARA);
    public static final Legislador dilvandaFaro = new Legislador(Legislador.DEPT_FEDERAL, "Dilvanda Faro", 13145, false, DatabasePartidos.PT, DatabaseEstados.PARA);
    public static final Legislador draAlessandraHaber = new Legislador(Legislador.DEPT_FEDERAL, "Dra. Alessandra Haber", 15167, false, DatabasePartidos.MDB, DatabaseEstados.PARA);
    public static final Legislador elcione = new Legislador(Legislador.DEPT_FEDERAL, "Elcione", 15189, true, DatabasePartidos.MDB, DatabaseEstados.PARA);
    public static final Legislador hendersonPinto = new Legislador(Legislador.DEPT_FEDERAL, "Henderson Pinto", 15201, false, DatabasePartidos.MDB, DatabaseEstados.PARA);
    public static final Legislador joaquimPassarinho = new Legislador(Legislador.DEPT_FEDERAL, "Joaquim Passarinho", 22167, true, DatabasePartidos.PL, DatabaseEstados.PARA);
    public static final Legislador juniorFerrari = new Legislador(Legislador.DEPT_FEDERAL, "Júnior Ferrari", 55123, true, DatabasePartidos.PSD, DatabaseEstados.PARA);
    public static final Legislador keniston = new Legislador(Legislador.DEPT_FEDERAL, "Keniston", 15223, false, DatabasePartidos.MDB, DatabaseEstados.PARA);
    public static final Legislador olivalMarques = new Legislador(Legislador.DEPT_FEDERAL, "Olival Marques", 15245, true, DatabasePartidos.MDB, DatabaseEstados.PARA);
    public static final Legislador priante = new Legislador(Legislador.DEPT_FEDERAL, "Priante", 15267, true, DatabasePartidos.MDB, DatabaseEstados.PARA);
    public static final Legislador raimundoSantos = new Legislador(Legislador.DEPT_FEDERAL, "Raimundo Santos", 55145, false, DatabasePartidos.PSD, DatabaseEstados.PARA);
    public static final Legislador renilceNicodemos = new Legislador(Legislador.DEPT_FEDERAL, "Renilce Nicodemos", 15289, false, DatabasePartidos.MDB, DatabaseEstados.PARA);

    // Paraíba (PB) - Deputados Federais (categoria 2)
    public static final Legislador aguinaldoRibeiro = new Legislador(Legislador.DEPT_FEDERAL, "Aguinaldo Ribeiro", 11123, true, DatabasePartidos.PP, DatabaseEstados.PARAIBA);
    public static final Legislador caboGilbertoSilva = new Legislador(Legislador.DEPT_FEDERAL, "Cabo Gilberto Silva", 22123, false, DatabasePartidos.PL, DatabaseEstados.PARAIBA);
    public static final Legislador drDamiao = new Legislador(Legislador.DEPT_FEDERAL, "Dr. Damião", 44123, true, DatabasePartidos.UNIAO, DatabaseEstados.PARAIBA);
    public static final Legislador gervasioMaia = new Legislador(Legislador.DEPT_FEDERAL, "Gervásio Maia", 40123, true, DatabasePartidos.PSB, DatabaseEstados.PARAIBA);
    public static final Legislador hugoMotta = new Legislador(Legislador.DEPT_FEDERAL, "Hugo Motta", 10123, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.PARAIBA);
    public static final Legislador luizCouto = new Legislador(Legislador.DEPT_FEDERAL, "Luiz Couto", 13123, false, DatabasePartidos.PT, DatabaseEstados.PARAIBA);
    public static final Legislador mersinhoLucena = new Legislador(Legislador.DEPT_FEDERAL, "Mersinho Lucena", 11145, false, DatabasePartidos.PP, DatabaseEstados.PARAIBA);
    public static final Legislador muriloGaldino = new Legislador(Legislador.DEPT_FEDERAL, "Murilo Galdino", 10145, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.PARAIBA);
    public static final Legislador romeroRodrigues = new Legislador(Legislador.DEPT_FEDERAL, "Romero Rodrigues", 20123, false, DatabasePartidos.PSC, DatabaseEstados.PARAIBA);
    public static final Legislador ruyCarneiro = new Legislador(Legislador.DEPT_FEDERAL, "Ruy Carneiro", 20145, true, DatabasePartidos.PSC, DatabaseEstados.PARAIBA);
    public static final Legislador wellingtonRoberto = new Legislador(Legislador.DEPT_FEDERAL, "Wellington Roberto", 22145, true, DatabasePartidos.PL, DatabaseEstados.PARAIBA);
    public static final Legislador wilsonSantiago = new Legislador(Legislador.DEPT_FEDERAL, "Wilson Santiago", 10167, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.PARAIBA);

    // Pernambuco (PE) - Deputados Federais (categoria 2)
    public static final Legislador andreFerreira = new Legislador(Legislador.DEPT_FEDERAL, "André Ferreira", 22123, true, DatabasePartidos.PL, DatabaseEstados.PERNAMBUCO);
    public static final Legislador augustoCoutinho = new Legislador(Legislador.DEPT_FEDERAL, "Augusto Coutinho", 10123, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.PERNAMBUCO);
    public static final Legislador carlosVeras = new Legislador(Legislador.DEPT_FEDERAL, "Carlos Veras", 13123, true, DatabasePartidos.PT, DatabaseEstados.PERNAMBUCO);
    public static final Legislador clarissaTercio = new Legislador(Legislador.DEPT_FEDERAL, "Clarissa Tércio", 11123, false, DatabasePartidos.PP, DatabaseEstados.PERNAMBUCO);
    public static final Legislador clodoaldoMagalhaes = new Legislador(Legislador.DEPT_FEDERAL, "Clodoaldo Magalhães", 43123, false, DatabasePartidos.PV, DatabaseEstados.PERNAMBUCO);
    public static final Legislador coronelMeira = new Legislador(Legislador.DEPT_FEDERAL, "Coronel Meira", 22145, false, DatabasePartidos.PL, DatabaseEstados.PERNAMBUCO);
    public static final Legislador eduardoDaFonte = new Legislador(Legislador.DEPT_FEDERAL, "Eduardo da Fonte", 11145, true, DatabasePartidos.PP, DatabaseEstados.PERNAMBUCO);
    public static final Legislador eribertoMedeiros = new Legislador(Legislador.DEPT_FEDERAL, "Eriberto Medeiros", 40123, false, DatabasePartidos.PSB, DatabaseEstados.PERNAMBUCO);
    public static final Legislador felipeCarreras = new Legislador(Legislador.DEPT_FEDERAL, "Felipe Carreras", 40145, true, DatabasePartidos.PSB, DatabaseEstados.PERNAMBUCO);
    public static final Legislador fernandoFilho = new Legislador(Legislador.DEPT_FEDERAL, "Fernando Filho", 44123, true, DatabasePartidos.UNIAO, DatabaseEstados.PERNAMBUCO);
    public static final Legislador fernandoMonteiro = new Legislador(Legislador.DEPT_FEDERAL, "Fernando Monteiro", 11167, true, DatabasePartidos.PP, DatabaseEstados.PERNAMBUCO);
    public static final Legislador fernandoRodolfo = new Legislador(Legislador.DEPT_FEDERAL, "Fernando Rodolfo", 22167, true, DatabasePartidos.PL, DatabaseEstados.PERNAMBUCO);
    public static final Legislador guilhermeUchoaJunior = new Legislador(Legislador.DEPT_FEDERAL, "Guilherme Uchôa Junior", 40167, false, DatabasePartidos.PSB, DatabaseEstados.PERNAMBUCO);
    public static final Legislador izaArruda = new Legislador(Legislador.DEPT_FEDERAL, "Iza Arruda", 15123, false, DatabasePartidos.MDB, DatabaseEstados.PERNAMBUCO);
    public static final Legislador lucasRamos = new Legislador(Legislador.DEPT_FEDERAL, "Lucas Ramos", 40189, false, DatabasePartidos.PSB, DatabaseEstados.PERNAMBUCO);
    public static final Legislador lucianoBivar = new Legislador(Legislador.DEPT_FEDERAL, "Luciano Bivar", 44145, true, DatabasePartidos.UNIAO, DatabaseEstados.PERNAMBUCO);
    public static final Legislador lulaDaFonte = new Legislador(Legislador.DEPT_FEDERAL, "Lula da Fonte", 11189, false, DatabasePartidos.PP, DatabaseEstados.PERNAMBUCO);
    public static final Legislador mariaArraes = new Legislador(Legislador.DEPT_FEDERAL, "Maria Arraes", 77123, false, DatabasePartidos.SOLIDARIEDADE, DatabaseEstados.PERNAMBUCO);
    public static final Legislador mendoncaFilho = new Legislador(Legislador.DEPT_FEDERAL, "Mendonça Filho", 44167, false, DatabasePartidos.UNIAO, DatabaseEstados.PERNAMBUCO);
    public static final Legislador pastorEurico = new Legislador(Legislador.DEPT_FEDERAL, "Pastor Eurico", 22189, true, DatabasePartidos.PL, DatabaseEstados.PERNAMBUCO);
    public static final Legislador pedroCampos = new Legislador(Legislador.DEPT_FEDERAL, "Pedro Campos", 40201, false, DatabasePartidos.PSB, DatabaseEstados.PERNAMBUCO);
    public static final Legislador renildoCalheiros = new Legislador(Legislador.DEPT_FEDERAL, "Renildo Calheiros", 65123, true, DatabasePartidos.PCDOB, DatabaseEstados.PERNAMBUCO);
    public static final Legislador silvioCostaFilho = new Legislador(Legislador.DEPT_FEDERAL, "Sílvio Costa Filho", 10145, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.PERNAMBUCO);
    public static final Legislador tulioGadelha = new Legislador(Legislador.DEPT_FEDERAL, "Túlio Gadelha", 18123, true, DatabasePartidos.REDE, DatabaseEstados.PERNAMBUCO);
    public static final Legislador waldemarOliveira = new Legislador(Legislador.DEPT_FEDERAL, "Waldemar Oliveira", 70123, false, DatabasePartidos.AVANTE, DatabaseEstados.PERNAMBUCO);

    // Piauí (PI) - Deputados Federais (categoria 2)
    public static final Legislador atila = new Legislador(Legislador.DEPT_FEDERAL, "Atila", 11123, false, DatabasePartidos.PP, DatabaseEstados.PIAUI);
    public static final Legislador castroNeto = new Legislador(Legislador.DEPT_FEDERAL, "Castro Neto", 55123, false, DatabasePartidos.PSD, DatabaseEstados.PIAUI);
    public static final Legislador drFrancisco = new Legislador(Legislador.DEPT_FEDERAL, "Dr. Francisco", 13123, false, DatabasePartidos.PT, DatabaseEstados.PIAUI);
    public static final Legislador flavioNogueira = new Legislador(Legislador.DEPT_FEDERAL, "Flávio Nogueira", 13145, true, DatabasePartidos.PT, DatabaseEstados.PIAUI);
    public static final Legislador florentinoNeto = new Legislador(Legislador.DEPT_FEDERAL, "Florentino Neto", 13167, false, DatabasePartidos.PT, DatabaseEstados.PIAUI);
    public static final Legislador jadyelDaJupi = new Legislador(Legislador.DEPT_FEDERAL, "Jadyel da Jupi", 43123, false, DatabasePartidos.PV, DatabaseEstados.PIAUI);
    public static final Legislador julioArcoverde = new Legislador(Legislador.DEPT_FEDERAL, "Júlio Arcoverde", 11145, false, DatabasePartidos.PP, DatabaseEstados.PIAUI);
    public static final Legislador julioCesarPi = new Legislador(Legislador.DEPT_FEDERAL, "Júlio César", 55145, true, DatabasePartidos.PSD, DatabaseEstados.PIAUI);
    public static final Legislador marcosAurelioSampaio = new Legislador(Legislador.DEPT_FEDERAL, "Marcos Aurélio Sampaio", 55167, true, DatabasePartidos.PSD, DatabaseEstados.PIAUI);
    public static final Legislador merlongSolano = new Legislador(Legislador.DEPT_FEDERAL, "Merlong Solano", 13189, false, DatabasePartidos.PT, DatabaseEstados.PIAUI);

    // Paraná (PR) - Deputados Federais (categoria 2)
    public static final Legislador alielMachado = new Legislador(Legislador.DEPT_FEDERAL, "Aliel Machado", 43123, true, DatabasePartidos.PV, DatabaseEstados.PARANA);
    public static final Legislador betoPreto = new Legislador(Legislador.DEPT_FEDERAL, "Beto Preto", 55123, false, DatabasePartidos.PSD, DatabaseEstados.PARANA);
    public static final Legislador betoRicha = new Legislador(Legislador.DEPT_FEDERAL, "Beto Richa", 45123, false, DatabasePartidos.PSDB, DatabaseEstados.PARANA);
    public static final Legislador carolDartora = new Legislador(Legislador.DEPT_FEDERAL, "Carol Dartora", 13123, false, DatabasePartidos.PT, DatabaseEstados.PARANA);
    public static final Legislador delegadoMatheusLaiola = new Legislador(Legislador.DEPT_FEDERAL, "Delegado Matheus Laiola", 44123, false, DatabasePartidos.UNIAO, DatabaseEstados.PARANA);
    public static final Legislador deltanDallagnol = new Legislador(Legislador.DEPT_FEDERAL, "Deltan Dallagnol", 19123, false, DatabasePartidos.PODE, DatabaseEstados.PARANA);
    public static final Legislador diegoGarcia = new Legislador(Legislador.DEPT_FEDERAL, "Diego Garcia", 10123, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.PARANA);
    public static final Legislador dilceuSperafico = new Legislador(Legislador.DEPT_FEDERAL, "Dilceu Sperafico", 11123, false, DatabasePartidos.PP, DatabaseEstados.PARANA);
    public static final Legislador enioVerri = new Legislador(Legislador.DEPT_FEDERAL, "Enio Verri", 13145, true, DatabasePartidos.PT, DatabaseEstados.PARANA);
    public static final Legislador felipeFrancischini = new Legislador(Legislador.DEPT_FEDERAL, "Felipe Francischini", 44145, true, DatabasePartidos.UNIAO, DatabaseEstados.PARANA);
    public static final Legislador filipeBarros = new Legislador(Legislador.DEPT_FEDERAL, "Filipe Barros", 22123, true, DatabasePartidos.PL, DatabaseEstados.PARANA);
    public static final Legislador geraldoMendes = new Legislador(Legislador.DEPT_FEDERAL, "Geraldo Mendes", 44167, false, DatabasePartidos.UNIAO, DatabaseEstados.PARANA);
    public static final Legislador giacobo = new Legislador(Legislador.DEPT_FEDERAL, "Giacobo", 22145, true, DatabasePartidos.PL, DatabaseEstados.PARANA);
    public static final Legislador gleisi = new Legislador(Legislador.DEPT_FEDERAL, "Gleisi", 13167, true, DatabasePartidos.PT, DatabaseEstados.PARANA);
    public static final Legislador leandre = new Legislador(Legislador.DEPT_FEDERAL, "Leandre", 55145, true, DatabasePartidos.PSD, DatabaseEstados.PARANA);
    public static final Legislador lucianoDucci = new Legislador(Legislador.DEPT_FEDERAL, "Luciano Ducci", 40123, false, DatabasePartidos.PSB, DatabaseEstados.PARANA);
    public static final Legislador luisaCanziani = new Legislador(Legislador.DEPT_FEDERAL, "Luísa Canziani", 55167, true, DatabasePartidos.PSD, DatabaseEstados.PARANA);
    public static final Legislador luizNishimori = new Legislador(Legislador.DEPT_FEDERAL, "Luiz Nishimori", 55189, true, DatabasePartidos.PSD, DatabaseEstados.PARANA);
    public static final Legislador padovani = new Legislador(Legislador.DEPT_FEDERAL, "Padovani", 44189, false, DatabasePartidos.UNIAO, DatabaseEstados.PARANA);
    public static final Legislador pauloLitro = new Legislador(Legislador.DEPT_FEDERAL, "Paulo Litro", 55201, false, DatabasePartidos.PSD, DatabaseEstados.PARANA);
    public static final Legislador pedroLupion = new Legislador(Legislador.DEPT_FEDERAL, "Pedro Lupion", 11145, true, DatabasePartidos.PP, DatabaseEstados.PARANA);
    public static final Legislador ricardoBarros = new Legislador(Legislador.DEPT_FEDERAL, "Ricardo Barros", 11167, true, DatabasePartidos.PP, DatabaseEstados.PARANA);
    public static final Legislador sandroAlex = new Legislador(Legislador.DEPT_FEDERAL, "Sandro Alex", 55223, true, DatabasePartidos.PSD, DatabaseEstados.PARANA);
    public static final Legislador sargentoFahur = new Legislador(Legislador.DEPT_FEDERAL, "Sargento Fahur", 55245, false, DatabasePartidos.PSD, DatabaseEstados.PARANA);
    public static final Legislador sergioSouza = new Legislador(Legislador.DEPT_FEDERAL, "Sérgio Souza", 15123, true, DatabasePartidos.MDB, DatabaseEstados.PARANA);
    public static final Legislador tadeuVeneri = new Legislador(Legislador.DEPT_FEDERAL, "Tadeu Veneri", 13189, false, DatabasePartidos.PT, DatabaseEstados.PARANA);
    public static final Legislador tiaoMedeiros = new Legislador(Legislador.DEPT_FEDERAL, "Tião Medeiros", 11189, false, DatabasePartidos.PP, DatabaseEstados.PARANA);
    public static final Legislador toninhoWandscheer = new Legislador(Legislador.DEPT_FEDERAL, "Toninho Wandscheer", 90123, true, DatabasePartidos.PROS, DatabaseEstados.PARANA);
    public static final Legislador vermelho = new Legislador(Legislador.DEPT_FEDERAL, "Vermelho", 22167, true, DatabasePartidos.PL, DatabaseEstados.PARANA);
    public static final Legislador zecaDirceu = new Legislador(Legislador.DEPT_FEDERAL, "Zeca Dirceu", 13201, true, DatabasePartidos.PT, DatabaseEstados.PARANA);

    // Rio de Janeiro (RJ) - Deputados Federais
    public static final Legislador altineuCortes = new Legislador(Legislador.DEPT_FEDERAL, "Altineu Cortes", 22123, false, DatabasePartidos.PL, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador aureoRibeiro = new Legislador(Legislador.DEPT_FEDERAL, "Aureo Ribeiro", 77123, true, DatabasePartidos.SOLIDARIEDADE, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador bandeiraDeMello = new Legislador(Legislador.DEPT_FEDERAL, "Bandeira de Mello", 40123, false, DatabasePartidos.PSB, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador bebeto = new Legislador(Legislador.DEPT_FEDERAL, "Bebeto", 14123, false, DatabasePartidos.PTB, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador beneditaDaSilva = new Legislador(Legislador.DEPT_FEDERAL, "Benedita da Silva", 13123, true, DatabasePartidos.PT, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador carlosJordy = new Legislador(Legislador.DEPT_FEDERAL, "Carlos Jordy", 22145, true, DatabasePartidos.PL, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador chicoAlencar = new Legislador(Legislador.DEPT_FEDERAL, "Chico Alencar", 50123, false, DatabasePartidos.PSOL, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador chiquinhoBrazao = new Legislador(Legislador.DEPT_FEDERAL, "Chiquinho Brazão", 44123, true, DatabasePartidos.UNIAO, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador chrisTonietto = new Legislador(Legislador.DEPT_FEDERAL, "Chris Tonietto", 22167, true, DatabasePartidos.PL, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador daniCunha = new Legislador(Legislador.DEPT_FEDERAL, "Dani Cunha", 44145, false, DatabasePartidos.UNIAO, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador danielSoranz = new Legislador(Legislador.DEPT_FEDERAL, "Daniel Soranz", 55123, false, DatabasePartidos.PSD, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador danielaDoWaguinho = new Legislador(Legislador.DEPT_FEDERAL, "Daniela do Waguinho", 44167, true, DatabasePartidos.UNIAO, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador delegadoRamagem = new Legislador(Legislador.DEPT_FEDERAL, "Delegado Ramagem", 22189, false, DatabasePartidos.PL, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador dimasGadelha = new Legislador(Legislador.DEPT_FEDERAL, "Dimas Gadelha", 13145, false, DatabasePartidos.PT, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador doutorLuizinho = new Legislador(Legislador.DEPT_FEDERAL, "Doutor Luizinho", 11123, true, DatabasePartidos.PP, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador generalPazuello = new Legislador(Legislador.DEPT_FEDERAL, "General Pazuello", 22201, false, DatabasePartidos.PL, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador glauber = new Legislador(Legislador.DEPT_FEDERAL, "Glauber", 50145, true, DatabasePartidos.PSOL, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador gutembergReis = new Legislador(Legislador.DEPT_FEDERAL, "Gutemberg Reis", 15123, true, DatabasePartidos.MDB, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador helioFernandoBarbosa = new Legislador(Legislador.DEPT_FEDERAL, "Hélio Fernando Barbosa", 22223, true, DatabasePartidos.PL, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador hugoLeal = new Legislador(Legislador.DEPT_FEDERAL, "Hugo Leal", 55145, true, DatabasePartidos.PSD, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador jandiraFeghali = new Legislador(Legislador.DEPT_FEDERAL, "Jandira Feghali", 65123, true, DatabasePartidos.PCDOB, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador jorgeBraz = new Legislador(Legislador.DEPT_FEDERAL, "Jorge Braz", 10123, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador julioLopes = new Legislador(Legislador.DEPT_FEDERAL, "Julio Lopes", 11145, true, DatabasePartidos.PP, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador juninhoDoPneu = new Legislador(Legislador.DEPT_FEDERAL, "Juninho do Pneu", 44189, true, DatabasePartidos.UNIAO, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador lauraCarneiro = new Legislador(Legislador.DEPT_FEDERAL, "Laura Carneiro", 55167, true, DatabasePartidos.PSD, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador lindberghFarias = new Legislador(Legislador.DEPT_FEDERAL, "Lindbergh Farias", 13167, false, DatabasePartidos.PT, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador lucianoVieira = new Legislador(Legislador.DEPT_FEDERAL, "Luciano Vieira", 22245, false, DatabasePartidos.PL, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador luizLima = new Legislador(Legislador.DEPT_FEDERAL, "Luiz Lima", 22267, true, DatabasePartidos.PL, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador marceloCrivella = new Legislador(Legislador.DEPT_FEDERAL, "Marcelo Crivella", 10145, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador marceloQueiroz = new Legislador(Legislador.DEPT_FEDERAL, "Marcelo Queiroz", 11167, false, DatabasePartidos.PP, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador marcosRrSoares = new Legislador(Legislador.DEPT_FEDERAL, "Marcos RR Soares", 44201, true, DatabasePartidos.UNIAO, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador marcosTavares = new Legislador(Legislador.DEPT_FEDERAL, "Marcos Tavares", 12123, false, DatabasePartidos.PDT, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador max = new Legislador(Legislador.DEPT_FEDERAL, "Max", 90123, false, DatabasePartidos.PROS, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador murilloGouvea = new Legislador(Legislador.DEPT_FEDERAL, "Murillo Gouvea", 44223, false, DatabasePartidos.UNIAO, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador otoniDePaula = new Legislador(Legislador.DEPT_FEDERAL, "Otoni de Paula", 15145, true, DatabasePartidos.MDB, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador pastorHenriqueVieira = new Legislador(Legislador.DEPT_FEDERAL, "Pastor Henrique Vieira", 50167, false, DatabasePartidos.PSOL, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador pedroPaulo = new Legislador(Legislador.DEPT_FEDERAL, "Pedro Paulo", 55189, true, DatabasePartidos.PSD, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador reimont = new Legislador(Legislador.DEPT_FEDERAL, "Reimont", 13189, false, DatabasePartidos.PT, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador robertoMonteiroPai = new Legislador(Legislador.DEPT_FEDERAL, "Roberto Monteiro Pai", 22289, false, DatabasePartidos.PL, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador rosangelaGomes = new Legislador(Legislador.DEPT_FEDERAL, "Rosangela Gomes", 10167, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador sargentoPortugal = new Legislador(Legislador.DEPT_FEDERAL, "Sargento Portugal", 19123, false, DatabasePartidos.PODE, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador sorayaSantos = new Legislador(Legislador.DEPT_FEDERAL, "Soraya Santos", 22301, true, DatabasePartidos.PL, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador sostenesCavalcante = new Legislador(Legislador.DEPT_FEDERAL, "Sóstenes Cavalcante", 22323, true, DatabasePartidos.PL, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador taliriaPetrone = new Legislador(Legislador.DEPT_FEDERAL, "Talíria Petrone", 50189, true, DatabasePartidos.PSOL, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador tarcisioMotta = new Legislador(Legislador.DEPT_FEDERAL, "Tarcísio Motta", 50201, false, DatabasePartidos.PSOL, DatabaseEstados.RIO_DE_JANEIRO);
    public static final Legislador washingtonQuaqua = new Legislador(Legislador.DEPT_FEDERAL, "Washington Quaquá", 13201, false, DatabasePartidos.PT, DatabaseEstados.RIO_DE_JANEIRO);

    // Rio Grande do Norte (RN) - Deputados Federais (categoria 2)
    public static final Legislador benesLeocadio = new Legislador(Legislador.DEPT_FEDERAL, "Benes Leocádio", 44123, true, DatabasePartidos.UNIAO, DatabaseEstados.RIO_GRANDE_DO_NORTE);
    public static final Legislador generalGirao = new Legislador(Legislador.DEPT_FEDERAL, "General Girão", 22123, true, DatabasePartidos.PL, DatabaseEstados.RIO_GRANDE_DO_NORTE);
    public static final Legislador joaoMaia = new Legislador(Legislador.DEPT_FEDERAL, "João Maia", 22145, true, DatabasePartidos.PL, DatabaseEstados.RIO_GRANDE_DO_NORTE);
    public static final Legislador mineiro = new Legislador(Legislador.DEPT_FEDERAL, "Mineiro", 13123, false, DatabasePartidos.PT, DatabaseEstados.RIO_GRANDE_DO_NORTE);
    public static final Legislador nataliaBonavides = new Legislador(Legislador.DEPT_FEDERAL, "Natália Bonavides", 13145, true, DatabasePartidos.PT, DatabaseEstados.RIO_GRANDE_DO_NORTE);
    public static final Legislador paulinhoFreire = new Legislador(Legislador.DEPT_FEDERAL, "Paulinho Freire", 44145, false, DatabasePartidos.UNIAO, DatabaseEstados.RIO_GRANDE_DO_NORTE);
    public static final Legislador robinsonFaria = new Legislador(Legislador.DEPT_FEDERAL, "Robinson Faria", 22167, false, DatabasePartidos.PL, DatabaseEstados.RIO_GRANDE_DO_NORTE);
    public static final Legislador sargentoGoncalves = new Legislador(Legislador.DEPT_FEDERAL, "Sargento Gonçalves", 22189, false, DatabasePartidos.PL, DatabaseEstados.RIO_GRANDE_DO_NORTE);

    // Rondônia (RO) - Deputados Federais (categoria 2)
    public static final Legislador coronelChrisostomo = new Legislador(Legislador.DEPT_FEDERAL, "Coronel Chrisóstomo", 22123, true, DatabasePartidos.PL, DatabaseEstados.RONDONIA);
    public static final Legislador cristianeLopes = new Legislador(Legislador.DEPT_FEDERAL, "Cristiane Lopes", 44123, false, DatabasePartidos.UNIAO, DatabaseEstados.RONDONIA);
    public static final Legislador drFernandoMaximo = new Legislador(Legislador.DEPT_FEDERAL, "Dr. Fernando Máximo", 44145, false, DatabasePartidos.UNIAO, DatabaseEstados.RONDONIA);
    public static final Legislador lebrao = new Legislador(Legislador.DEPT_FEDERAL, "Lebrão", 44167, false, DatabasePartidos.UNIAO, DatabaseEstados.RONDONIA);
    public static final Legislador lucioMosquini = new Legislador(Legislador.DEPT_FEDERAL, "Lucio Mosquini", 15123, true, DatabasePartidos.MDB, DatabaseEstados.RONDONIA);
    public static final Legislador mauricioCarvalho = new Legislador(Legislador.DEPT_FEDERAL, "Maurício Carvalho", 44189, false, DatabasePartidos.UNIAO, DatabaseEstados.RONDONIA);
    public static final Legislador silviaCristina = new Legislador(Legislador.DEPT_FEDERAL, "Silvia Cristina", 22145, true, DatabasePartidos.PL, DatabaseEstados.RONDONIA);
    public static final Legislador thiagoFlores = new Legislador(Legislador.DEPT_FEDERAL, "Thiago Flores", 15145, false, DatabasePartidos.MDB, DatabaseEstados.RONDONIA);

    // Roraima (RR) - Deputados Federais (categoria 2)
    public static final Legislador albuquerque = new Legislador(Legislador.DEPT_FEDERAL, "Albuquerque", 10123, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.RORAIMA);
    public static final Legislador defensorStelioDener = new Legislador(Legislador.DEPT_FEDERAL, "Defensor Stélio Dener", 10145, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.RORAIMA);
    public static final Legislador dudaRamos = new Legislador(Legislador.DEPT_FEDERAL, "Duda Ramos", 15123, false, DatabasePartidos.MDB, DatabaseEstados.RORAIMA);
    public static final Legislador helenaDaAsatur = new Legislador(Legislador.DEPT_FEDERAL, "Helena da Asatur", 15145, false, DatabasePartidos.MDB, DatabaseEstados.RORAIMA);
    public static final Legislador jhonatanDeJesus = new Legislador(Legislador.DEPT_FEDERAL, "Jhonatan de Jesus", 10167, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.RORAIMA);
    public static final Legislador nicolette = new Legislador(Legislador.DEPT_FEDERAL, "Nicolette", 44123, true, DatabasePartidos.UNIAO, DatabaseEstados.RORAIMA);
    public static final Legislador pastorDiniz = new Legislador(Legislador.DEPT_FEDERAL, "Pastor Diniz", 44145, false, DatabasePartidos.UNIAO, DatabaseEstados.RORAIMA);
    public static final Legislador zeHaroldoCathedral = new Legislador(Legislador.DEPT_FEDERAL, "Zé Haroldo Cathedral", 55123, false, DatabasePartidos.PSD, DatabaseEstados.RORAIMA);

    // Rio Grande do Sul (RS) - Deputados Federais (categoria 2)
    public static final Legislador afonsoHamm = new Legislador(Legislador.DEPT_FEDERAL, "Afonso Hamm", 11123, true, DatabasePartidos.PP, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador afonsoMotta = new Legislador(Legislador.DEPT_FEDERAL, "Afonso Motta", 12123, true, DatabasePartidos.PDT, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador alceuMoreira = new Legislador(Legislador.DEPT_FEDERAL, "Alceu Moreira", 15123, true, DatabasePartidos.MDB, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador alcibioMesquitaBiboNunes = new Legislador(Legislador.DEPT_FEDERAL, "Alcibio Mesquita Bibo Nunes", 22123, false, DatabasePartidos.PL, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador alexandreLindenmeyer = new Legislador(Legislador.DEPT_FEDERAL, "Alexandre Lindenmeyer", 13123, false, DatabasePartidos.PT, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador anyOrtiz = new Legislador(Legislador.DEPT_FEDERAL, "Any Ortiz", 23123, false, DatabasePartidos.CIDADANIA, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador bohnGass = new Legislador(Legislador.DEPT_FEDERAL, "Bohn Gass", 13145, true, DatabasePartidos.PT, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador busato = new Legislador(Legislador.DEPT_FEDERAL, "Busato", 44123, false, DatabasePartidos.UNIAO, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador carlosGomes = new Legislador(Legislador.DEPT_FEDERAL, "Carlos Gomes", 10123, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador covattiFilho = new Legislador(Legislador.DEPT_FEDERAL, "Covatti Filho", 11145, true, DatabasePartidos.PP, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador daianaSantos = new Legislador(Legislador.DEPT_FEDERAL, "Daiana Santos", 65123, false, DatabasePartidos.PCDOB, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador danielTrzecjak = new Legislador(Legislador.DEPT_FEDERAL, "Daniel Trzecjak (Daniel da TV)", 45123, true, DatabasePartidos.PSDB, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador danrleiDeusGoleiro = new Legislador(Legislador.DEPT_FEDERAL, "Danrlei de Deus Goleiro", 55123, true, DatabasePartidos.PSD, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador denisePessoa = new Legislador(Legislador.DEPT_FEDERAL, "Denise Pessôa", 13167, false, DatabasePartidos.PT, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador fernandaMelchionna = new Legislador(Legislador.DEPT_FEDERAL, "Fernanda Melchionna", 50123, true, DatabasePartidos.PSOL, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador francianeBayer = new Legislador(Legislador.DEPT_FEDERAL, "Franciane Bayer", 10145, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador giovaniCherini = new Legislador(Legislador.DEPT_FEDERAL, "Giovani Cherini", 22145, true, DatabasePartidos.PL, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador heitorSchuch = new Legislador(Legislador.DEPT_FEDERAL, "Heitor Schuch", 40123, true, DatabasePartidos.PSB, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador lucasRedecker = new Legislador(Legislador.DEPT_FEDERAL, "Lucas Redecker", 45145, true, DatabasePartidos.PSDB, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador marcelVanHattem = new Legislador(Legislador.DEPT_FEDERAL, "Marcel van Hattem", 30123, true, DatabasePartidos.NOVO, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador marceloMoraes = new Legislador(Legislador.DEPT_FEDERAL, "Marcelo Moraes", 22167, true, DatabasePartidos.PL, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador marcioBiolchi = new Legislador(Legislador.DEPT_FEDERAL, "Marcio Biolchi", 15145, true, DatabasePartidos.MDB, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador marcon = new Legislador(Legislador.DEPT_FEDERAL, "Marcon", 13189, true, DatabasePartidos.PT, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador mariaDoRosario = new Legislador(Legislador.DEPT_FEDERAL, "Maria do Rosário", 13201, true, DatabasePartidos.PT, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador mauricioMarcon = new Legislador(Legislador.DEPT_FEDERAL, "Maurício Marcon", 19123, false, DatabasePartidos.PODE, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador osmarTerra = new Legislador(Legislador.DEPT_FEDERAL, "Osmar Terra", 15167, true, DatabasePartidos.MDB, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador pauloPimenta = new Legislador(Legislador.DEPT_FEDERAL, "Paulo Pimenta", 13223, true, DatabasePartidos.PT, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador pedroWestphalen = new Legislador(Legislador.DEPT_FEDERAL, "Pedro Westphalen", 11167, true, DatabasePartidos.PP, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador pompeoDeMattos = new Legislador(Legislador.DEPT_FEDERAL, "Pompeo de Mattos", 12145, true, DatabasePartidos.PDT, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador sanderson = new Legislador(Legislador.DEPT_FEDERAL, "Sanderson", 22189, true, DatabasePartidos.PL, DatabaseEstados.RIO_GRANDE_DO_SUL);
    public static final Legislador tenenteCoronelZucco = new Legislador(Legislador.DEPT_FEDERAL, "Tenente Coronel Zucco", 10167, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.RIO_GRANDE_DO_SUL);

    // Santa Catarina (SC) - Deputados Federais (categoria 2)
    public static final Legislador anaPaulaLima = new Legislador(Legislador.DEPT_FEDERAL, "Ana Paula Lima", 13123, false, DatabasePartidos.PT, DatabaseEstados.SANTA_CATARINA);
    public static final Legislador carlosChiodini = new Legislador(Legislador.DEPT_FEDERAL, "Carlos Chiodini", 15123, true, DatabasePartidos.MDB, DatabaseEstados.SANTA_CATARINA);
    public static final Legislador carmenZanotto = new Legislador(Legislador.DEPT_FEDERAL, "Carmen Zanotto", 23123, true, DatabasePartidos.CIDADANIA, DatabaseEstados.SANTA_CATARINA);
    public static final Legislador carolDeToni = new Legislador(Legislador.DEPT_FEDERAL, "Carol de Toni", 22123, true, DatabasePartidos.PL, DatabaseEstados.SANTA_CATARINA);
    public static final Legislador cobalchini = new Legislador(Legislador.DEPT_FEDERAL, "Cobalchini", 15145, false, DatabasePartidos.MDB, DatabaseEstados.SANTA_CATARINA);
    public static final Legislador danielFreitas = new Legislador(Legislador.DEPT_FEDERAL, "Daniel Freitas", 22145, true, DatabasePartidos.PL, DatabaseEstados.SANTA_CATARINA);
    public static final Legislador danielaReinehr = new Legislador(Legislador.DEPT_FEDERAL, "Daniela Reinehr", 22167, false, DatabasePartidos.PL, DatabaseEstados.SANTA_CATARINA);
    public static final Legislador fabioSchiochet = new Legislador(Legislador.DEPT_FEDERAL, "Fabio Schiochet", 44123, true, DatabasePartidos.UNIAO, DatabaseEstados.SANTA_CATARINA);
    public static final Legislador gilsonMarques = new Legislador(Legislador.DEPT_FEDERAL, "Gilson Marques", 30123, true, DatabasePartidos.NOVO, DatabaseEstados.SANTA_CATARINA);
    public static final Legislador ismael = new Legislador(Legislador.DEPT_FEDERAL, "Ismael", 55123, false, DatabasePartidos.PSD, DatabaseEstados.SANTA_CATARINA);
    public static final Legislador jorgeGoetten = new Legislador(Legislador.DEPT_FEDERAL, "Jorge Goetten", 22189, true, DatabasePartidos.PL, DatabaseEstados.SANTA_CATARINA);
    public static final Legislador juliaZanatta = new Legislador(Legislador.DEPT_FEDERAL, "Julia Zanatta", 22201, false, DatabasePartidos.PL, DatabaseEstados.SANTA_CATARINA);
    public static final Legislador professorPedroUczai = new Legislador(Legislador.DEPT_FEDERAL, "Professor Pedro Uczai", 13145, true, DatabasePartidos.PT, DatabaseEstados.SANTA_CATARINA);
    public static final Legislador rafaelPezenti = new Legislador(Legislador.DEPT_FEDERAL, "Rafael Pezenti", 15167, false, DatabasePartidos.MDB, DatabaseEstados.SANTA_CATARINA);
    public static final Legislador ricardoGuidi = new Legislador(Legislador.DEPT_FEDERAL, "Ricardo Guidi", 55145, true, DatabasePartidos.PSD, DatabaseEstados.SANTA_CATARINA);
    public static final Legislador zeTrovao = new Legislador(Legislador.DEPT_FEDERAL, "Zé Trovão", 22223, false, DatabasePartidos.PL, DatabaseEstados.SANTA_CATARINA);

    // Sergipe (SE) - Deputados Federais (categoria 2)
    public static final Legislador delegadaKatarina = new Legislador(Legislador.DEPT_FEDERAL, "Delegada Katarina", 55123, false, DatabasePartidos.PSD, DatabaseEstados.SERGIPE);
    public static final Legislador fabioReis = new Legislador(Legislador.DEPT_FEDERAL, "Fabio Reis", 55145, true, DatabasePartidos.PSD, DatabaseEstados.SERGIPE);
    public static final Legislador gustinhoRibeiro = new Legislador(Legislador.DEPT_FEDERAL, "Gustinho Ribeiro", 10123, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.SERGIPE);
    public static final Legislador icaroDeValmir = new Legislador(Legislador.DEPT_FEDERAL, "Icaro de Valmir", 22123, false, DatabasePartidos.PL, DatabaseEstados.SERGIPE);
    public static final Legislador joaoDaniel = new Legislador(Legislador.DEPT_FEDERAL, "João Daniel", 13123, false, DatabasePartidos.PT, DatabaseEstados.SERGIPE);
    public static final Legislador rodrigoValadares = new Legislador(Legislador.DEPT_FEDERAL, "Rodrigo Valadares", 44123, false, DatabasePartidos.UNIAO, DatabaseEstados.SERGIPE);
    public static final Legislador thiagoDeJoaldo = new Legislador(Legislador.DEPT_FEDERAL, "Thiago de Joaldo", 11123, false, DatabasePartidos.PP, DatabaseEstados.SERGIPE);
    public static final Legislador yandraDeAndre = new Legislador(Legislador.DEPT_FEDERAL, "Yandra de André", 44145, false, DatabasePartidos.UNIAO, DatabaseEstados.SERGIPE);

    // São Paulo (SP) - Deputados Federais (categoria 2)
    public static final Legislador adrianaVentura = new Legislador(Legislador.DEPT_FEDERAL, "Adriana Ventura", 30123, true, DatabasePartidos.NOVO, DatabaseEstados.SAO_PAULO);
    public static final Legislador albertoMourao = new Legislador(Legislador.DEPT_FEDERAL, "Alberto Mourão", 15123, false, DatabasePartidos.MDB, DatabaseEstados.SAO_PAULO);
    public static final Legislador alencarSantana = new Legislador(Legislador.DEPT_FEDERAL, "Alencar Santana", 13123, true, DatabasePartidos.PT, DatabaseEstados.SAO_PAULO);
    public static final Legislador alexManente = new Legislador(Legislador.DEPT_FEDERAL, "Alex Manente", 23123, true, DatabasePartidos.CIDADANIA, DatabaseEstados.SAO_PAULO);
    public static final Legislador alexandreLeite = new Legislador(Legislador.DEPT_FEDERAL, "Alexandre Leite", 44123, true, DatabasePartidos.UNIAO, DatabaseEstados.SAO_PAULO);
    public static final Legislador alexandrePadilha = new Legislador(Legislador.DEPT_FEDERAL, "Alexandre Padilha", 13145, true, DatabasePartidos.PT, DatabaseEstados.SAO_PAULO);
    public static final Legislador antonioCarlosRodrigues = new Legislador(Legislador.DEPT_FEDERAL, "Antonio Carlos Rodrigues", 22123, false, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    public static final Legislador arlindoChinaglia = new Legislador(Legislador.DEPT_FEDERAL, "Arlindo Chinaglia", 13167, true, DatabasePartidos.PT, DatabaseEstados.SAO_PAULO);
    public static final Legislador arnaldoJardim = new Legislador(Legislador.DEPT_FEDERAL, "Arnaldo Jardim", 23145, true, DatabasePartidos.CIDADANIA, DatabaseEstados.SAO_PAULO);
    public static final Legislador baleiaRossi = new Legislador(Legislador.DEPT_FEDERAL, "Baleia Rossi", 15145, true, DatabasePartidos.MDB, DatabaseEstados.SAO_PAULO);
    public static final Legislador brunoGanem = new Legislador(Legislador.DEPT_FEDERAL, "Bruno Ganem", 19123, false, DatabasePartidos.PODE, DatabaseEstados.SAO_PAULO);
    public static final Legislador capitaoAugusto = new Legislador(Legislador.DEPT_FEDERAL, "Capitão Augusto", 22145, true, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    public static final Legislador capitaoDerrite = new Legislador(Legislador.DEPT_FEDERAL, "Capitão Derrite", 22167, true, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    public static final Legislador carlaZambelli = new Legislador(Legislador.DEPT_FEDERAL, "Carla Zambelli", 22189, true, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    public static final Legislador carlosSampaio = new Legislador(Legislador.DEPT_FEDERAL, "Carlos Sampaio", 45123, true, DatabasePartidos.PSDB, DatabaseEstados.SAO_PAULO);
    public static final Legislador carlosZarattini = new Legislador(Legislador.DEPT_FEDERAL, "Carlos Zarattini", 13189, true, DatabasePartidos.PT, DatabaseEstados.SAO_PAULO);
    public static final Legislador celsoRussomanno = new Legislador(Legislador.DEPT_FEDERAL, "Celso Russomanno", 10123, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.SAO_PAULO);
    public static final Legislador cezinhaDeMadureira = new Legislador(Legislador.DEPT_FEDERAL, "Cezinha de Madureira", 55123, true, DatabasePartidos.PSD, DatabaseEstados.SAO_PAULO);
    public static final Legislador davidSoares = new Legislador(Legislador.DEPT_FEDERAL, "David Soares", 44145, true, DatabasePartidos.UNIAO, DatabaseEstados.SAO_PAULO);
    public static final Legislador delegadoBrunoLima = new Legislador(Legislador.DEPT_FEDERAL, "Delegado Bruno Lima", 11123, false, DatabasePartidos.PP, DatabaseEstados.SAO_PAULO);
    public static final Legislador delegadoDaCunha = new Legislador(Legislador.DEPT_FEDERAL, "Delegado da Cunha", 11145, false, DatabasePartidos.PP, DatabaseEstados.SAO_PAULO);
    public static final Legislador delegadoPalumbo = new Legislador(Legislador.DEPT_FEDERAL, "Delegado Palumbo", 15167, false, DatabasePartidos.MDB, DatabaseEstados.SAO_PAULO);
    public static final Legislador delegadoPauloBilynskyj = new Legislador(Legislador.DEPT_FEDERAL, "Delegado Paulo Bilynskyj", 22201, false, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    public static final Legislador eduardoBolsonaro = new Legislador(Legislador.DEPT_FEDERAL, "Eduardo Bolsonaro", 22223, true, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    public static final Legislador erikaHilton = new Legislador(Legislador.DEPT_FEDERAL, "Erika Hilton", 50123, false, DatabasePartidos.PSOL, DatabaseEstados.SAO_PAULO);
    public static final Legislador fabioTeruel = new Legislador(Legislador.DEPT_FEDERAL, "Fabio Teruel", 15189, false, DatabasePartidos.MDB, DatabaseEstados.SAO_PAULO);
    public static final Legislador faustoPinato = new Legislador(Legislador.DEPT_FEDERAL, "Fausto Pinato", 11167, true, DatabasePartidos.PP, DatabaseEstados.SAO_PAULO);
    public static final Legislador felipeBecari = new Legislador(Legislador.DEPT_FEDERAL, "Felipe Becari", 44167, false, DatabasePartidos.UNIAO, DatabaseEstados.SAO_PAULO);
    public static final Legislador gilbertoNascimento = new Legislador(Legislador.DEPT_FEDERAL, "Gilberto Nascimento", 20123, true, DatabasePartidos.PSC, DatabaseEstados.SAO_PAULO);
    public static final Legislador guilhermeBoulos = new Legislador(Legislador.DEPT_FEDERAL, "Guilherme Boulos", 50145, false, DatabasePartidos.PSOL, DatabaseEstados.SAO_PAULO);
    public static final Legislador jeffersonCampos = new Legislador(Legislador.DEPT_FEDERAL, "Jefferson Campos", 22245, true, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    public static final Legislador jilmarTatto = new Legislador(Legislador.DEPT_FEDERAL, "Jilmar Tatto", 13201, false, DatabasePartidos.PT, DatabaseEstados.SAO_PAULO);
    public static final Legislador jonasDonizette = new Legislador(Legislador.DEPT_FEDERAL, "Jonas Donizette", 40123, false, DatabasePartidos.PSB, DatabaseEstados.SAO_PAULO);
    public static final Legislador julianaCardoso = new Legislador(Legislador.DEPT_FEDERAL, "Juliana Cardoso", 13223, false, DatabasePartidos.PT, DatabaseEstados.SAO_PAULO);
    public static final Legislador kikoCeleguim = new Legislador(Legislador.DEPT_FEDERAL, "Kiko Celeguim", 13245, false, DatabasePartidos.PT, DatabaseEstados.SAO_PAULO);
    public static final Legislador kimKataguiri = new Legislador(Legislador.DEPT_FEDERAL, "Kim Kataguiri", 44189, true, DatabasePartidos.UNIAO, DatabaseEstados.SAO_PAULO);
    public static final Legislador luizMarinho = new Legislador(Legislador.DEPT_FEDERAL, "Luiz Marinho", 13267, false, DatabasePartidos.PT, DatabaseEstados.SAO_PAULO);
    public static final Legislador luizPhilippeDeOBraga = new Legislador(Legislador.DEPT_FEDERAL, "Luiz Philippe de O Bragança", 22267, true, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    public static final Legislador luizaErundina = new Legislador(Legislador.DEPT_FEDERAL, "Luiza Erundina", 50167, true, DatabasePartidos.PSOL, DatabaseEstados.SAO_PAULO);
    public static final Legislador marangoni = new Legislador(Legislador.DEPT_FEDERAL, "Marangoni", 44201, false, DatabasePartidos.UNIAO, DatabaseEstados.SAO_PAULO);
    public static final Legislador marceloLima = new Legislador(Legislador.DEPT_FEDERAL, "Marcelo Lima", 77123, false, DatabasePartidos.SOLIDARIEDADE, DatabaseEstados.SAO_PAULO);
    public static final Legislador marcioAlvino = new Legislador(Legislador.DEPT_FEDERAL, "Marcio Alvino", 22289, true, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    public static final Legislador marcoBertaiolli = new Legislador(Legislador.DEPT_FEDERAL, "Marco Bertaiolli", 55145, true, DatabasePartidos.PSD, DatabaseEstados.SAO_PAULO);
    public static final Legislador marcosPereira = new Legislador(Legislador.DEPT_FEDERAL, "Marcos Pereira", 10145, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.SAO_PAULO);
    public static final Legislador mariaRosas = new Legislador(Legislador.DEPT_FEDERAL, "Maria Rosas", 10167, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.SAO_PAULO);
    public static final Legislador marinaSilva = new Legislador(Legislador.DEPT_FEDERAL, "Marina Silva", 18123, false, DatabasePartidos.REDE, DatabaseEstados.SAO_PAULO);
    public static final Legislador marioFrias = new Legislador(Legislador.DEPT_FEDERAL, "Mario Frias", 22301, false, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    public static final Legislador mauricioNeves = new Legislador(Legislador.DEPT_FEDERAL, "Mauricio Neves", 11189, false, DatabasePartidos.PP, DatabaseEstados.SAO_PAULO);
    public static final Legislador miguelLombardi = new Legislador(Legislador.DEPT_FEDERAL, "Miguel Lombardi", 22323, true, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    public static final Legislador miltonVieira = new Legislador(Legislador.DEPT_FEDERAL, "Milton Vieira", 10189, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.SAO_PAULO);
    public static final Legislador motta = new Legislador(Legislador.DEPT_FEDERAL, "Motta", 22345, true, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    public static final Legislador niltoTatto = new Legislador(Legislador.DEPT_FEDERAL, "Nilto Tatto", 13289, true, DatabasePartidos.PT, DatabaseEstados.SAO_PAULO);
    public static final Legislador pastorMarcoFeliciano = new Legislador(Legislador.DEPT_FEDERAL, "Pastor Marco Feliciano", 22367, true, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    public static final Legislador pauloAlexandreBarbosa = new Legislador(Legislador.DEPT_FEDERAL, "Paulo Alexandre Barbosa", 45145, false, DatabasePartidos.PSDB, DatabaseEstados.SAO_PAULO);
    public static final Legislador pauloFreireDaCosta = new Legislador(Legislador.DEPT_FEDERAL, "Paulo Freire da Costa", 22389, true, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    public static final Legislador pauloTeixeira = new Legislador(Legislador.DEPT_FEDERAL, "Paulo Teixeira", 13301, true, DatabasePartidos.PT, DatabaseEstados.SAO_PAULO);
    public static final Legislador renataAbreu = new Legislador(Legislador.DEPT_FEDERAL, "Renata Abreu", 19145, true, DatabasePartidos.PODE, DatabaseEstados.SAO_PAULO);
    public static final Legislador ricardoSalles = new Legislador(Legislador.DEPT_FEDERAL, "Ricardo Salles", 22401, false, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    public static final Legislador ricardoSilva = new Legislador(Legislador.DEPT_FEDERAL, "Ricardo Silva", 55167, true, DatabasePartidos.PSD, DatabaseEstados.SAO_PAULO);
    public static final Legislador rodrigoGambale = new Legislador(Legislador.DEPT_FEDERAL, "Rodrigo Gambale", 19167, false, DatabasePartidos.PODE, DatabaseEstados.SAO_PAULO);
    public static final Legislador rosanaValle = new Legislador(Legislador.DEPT_FEDERAL, "Rosana Valle", 22423, true, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    public static final Legislador rosangelaMoro = new Legislador(Legislador.DEPT_FEDERAL, "Rosângela Moro", 44223, false, DatabasePartidos.UNIAO, DatabaseEstados.SAO_PAULO);
    public static final Legislador ruiFalcao = new Legislador(Legislador.DEPT_FEDERAL, "Rui Falcão", 13323, true, DatabasePartidos.PT, DatabaseEstados.SAO_PAULO);
    public static final Legislador samiaBomfim = new Legislador(Legislador.DEPT_FEDERAL, "Sâmia Bomfim", 50189, true, DatabasePartidos.PSOL, DatabaseEstados.SAO_PAULO);
    public static final Legislador simoneMarquetto = new Legislador(Legislador.DEPT_FEDERAL, "Simone Marquetto", 15201, false, DatabasePartidos.MDB, DatabaseEstados.SAO_PAULO);
    public static final Legislador soniaGuajajara = new Legislador(Legislador.DEPT_FEDERAL, "Sônia Guajajara", 50201, false, DatabasePartidos.PSOL, DatabaseEstados.SAO_PAULO);
    public static final Legislador tabataAmaral = new Legislador(Legislador.DEPT_FEDERAL, "Tabata Amaral", 40145, true, DatabasePartidos.PSB, DatabaseEstados.SAO_PAULO);
    public static final Legislador tiririca = new Legislador(Legislador.DEPT_FEDERAL, "Tiririca", 22445, true, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    public static final Legislador viniciusCarvalho = new Legislador(Legislador.DEPT_FEDERAL, "Vinicius Carvalho", 10201, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.SAO_PAULO);
    public static final Legislador vitorLippi = new Legislador(Legislador.DEPT_FEDERAL, "Vitor Lippi", 45167, true, DatabasePartidos.PSDB, DatabaseEstados.SAO_PAULO);

    // Tocantins (TO) - Deputados Federais (categoria 2)
    public static final Legislador alexandreGuimaraes = new Legislador(Legislador.DEPT_FEDERAL, "Alexandre Guimarães", 10123, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.TOCANTINS);
    public static final Legislador carlosGaguim = new Legislador(Legislador.DEPT_FEDERAL, "Carlos Gaguim", 44123, true, DatabasePartidos.UNIAO, DatabaseEstados.TOCANTINS);
    public static final Legislador eliBorges = new Legislador(Legislador.DEPT_FEDERAL, "Eli Borges", 22123, true, DatabasePartidos.PL, DatabaseEstados.TOCANTINS);
    public static final Legislador filipeMartins = new Legislador(Legislador.DEPT_FEDERAL, "Filipe Martins", 22145, false, DatabasePartidos.PL, DatabaseEstados.TOCANTINS);
    public static final Legislador lazeroBotelho = new Legislador(Legislador.DEPT_FEDERAL, "Lazaro Botelho", 11123, true, DatabasePartidos.PP, DatabaseEstados.TOCANTINS);
    public static final Legislador ricardoAyres = new Legislador(Legislador.DEPT_FEDERAL, "Ricardo Ayres", 10145, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.TOCANTINS);
    public static final Legislador toinhoAndrade = new Legislador(Legislador.DEPT_FEDERAL, "Toinho Andrade", 10167, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.TOCANTINS);
    public static final Legislador vicentinhoJunior = new Legislador(Legislador.DEPT_FEDERAL, "Vicentinho Junior", 11145, true, DatabasePartidos.PP, DatabaseEstados.TOCANTINS);

    public ArrayList<Legislador> listAllDeputados(){
        ArrayList deputados = new ArrayList<>();
        for (Field field : this.getClass().getDeclaredFields()) {
            try {
                Legislador legislador = (Legislador) field.get(this);
                deputados.add(legislador);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return deputados;
    }
}