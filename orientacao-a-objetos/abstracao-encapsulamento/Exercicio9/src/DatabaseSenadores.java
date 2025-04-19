import java.lang.reflect.Field;
import java.util.ArrayList;

public class DatabaseSenadores {
    // Acre (AC) - Senadores
    Legislador alanRick = new Legislador(Legislador.SENADOR, "Alan Rick", 444, true, DatabasePartidos.UNIAO, DatabaseEstados.ACRE);
    Legislador marcioBittar = new Legislador(Legislador.SENADOR, "Marcio Bittar", 440, false, DatabasePartidos.UNIAO, DatabaseEstados.ACRE);
    Legislador sergioPetecao = new Legislador(Legislador.SENADOR, "Sérgio Petecão", 555, false, DatabasePartidos.PSD, DatabaseEstados.ACRE);

    // Alagoas (AL) - Senadores
    Legislador draEudocia = new Legislador(Legislador.SENADOR, "Dra. Eudócia", 221, false, DatabasePartidos.PL, DatabaseEstados.ALAGOAS);
    Legislador fernandoFarias = new Legislador(Legislador.SENADOR, "Fernando Farias", 151, false, DatabasePartidos.MDB, DatabaseEstados.ALAGOAS);
    Legislador renanCalheiros = new Legislador(Legislador.SENADOR, "Renan Calheiros", 150, true, DatabasePartidos.MDB, DatabaseEstados.ALAGOAS);

    // Amazonas (AM) - Senadores
    Legislador eduardoBraga = new Legislador(Legislador.SENADOR, "Eduardo Braga", 152, false, DatabasePartidos.MDB, DatabaseEstados.AMAZONAS);
    Legislador omarAziz = new Legislador(Legislador.SENADOR, "Omar Aziz", 556, true, DatabasePartidos.PSD, DatabaseEstados.AMAZONAS);
    Legislador plinioValerio = new Legislador(Legislador.SENADOR, "Plínio Valério", 450, false, DatabasePartidos.PSDB, DatabaseEstados.AMAZONAS);

    // Amapá (AP) - Senadores
    Legislador daviAlcolumbre = new Legislador(Legislador.SENADOR, "Davi Alcolumbre", 441, true, DatabasePartidos.UNIAO, DatabaseEstados.AMAPA);
    Legislador lucasBarreto = new Legislador(Legislador.SENADOR, "Lucas Barreto", 557, false, DatabasePartidos.PSD, DatabaseEstados.AMAPA);
    Legislador randolfeRodrigues = new Legislador(Legislador.SENADOR, "Randolfe Rodrigues", 131, false, DatabasePartidos.PT, DatabaseEstados.AMAPA);

    // Bahia (BA) - Senadores
    Legislador angeloCoronel = new Legislador(Legislador.SENADOR, "Angelo Coronel", 558, false, DatabasePartidos.PSD, DatabaseEstados.BAHIA);
    Legislador jaquesWagner = new Legislador(Legislador.SENADOR, "Jaques Wagner", 130, false, DatabasePartidos.PT, DatabaseEstados.BAHIA);
    Legislador ottoAlencar = new Legislador(Legislador.SENADOR, "Otto Alencar", 559, true, DatabasePartidos.PSD, DatabaseEstados.BAHIA);

    // Ceará (CE) - Senadores
    Legislador augustaBrito = new Legislador(Legislador.SENADOR, "Augusta Brito", 132, false, DatabasePartidos.PT, DatabaseEstados.CEARA);
    Legislador cidGomes = new Legislador(Legislador.SENADOR, "Cid Gomes", 400, false, DatabasePartidos.PSB, DatabaseEstados.CEARA);
    Legislador eduardoGirao = new Legislador(Legislador.SENADOR, "Eduardo Girão", 300, false, DatabasePartidos.NOVO, DatabaseEstados.CEARA);

    // Distrito Federal (DF) - Senadores
    Legislador damaresAlves = new Legislador(Legislador.SENADOR, "Damares Alves", 101, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.DISTRITO_FEDERAL);
    Legislador izalciLucas = new Legislador(Legislador.SENADOR, "Izalci Lucas", 222, false, DatabasePartidos.PL, DatabaseEstados.DISTRITO_FEDERAL);
    Legislador leilaBarros = new Legislador(Legislador.SENADOR, "Leila Barros", 120, false, DatabasePartidos.PDT, DatabaseEstados.DISTRITO_FEDERAL);

    // Espírito Santo (ES) - Senadores
    Legislador fabianoContarato = new Legislador(Legislador.SENADOR, "Fabiano Contarato", 133, false, DatabasePartidos.PT, DatabaseEstados.ESPIRITO_SANTO);
    Legislador magnoMalta = new Legislador(Legislador.SENADOR, "Magno Malta", 223, true, DatabasePartidos.PL, DatabaseEstados.ESPIRITO_SANTO);
    Legislador marcosDoVal = new Legislador(Legislador.SENADOR, "Marcos do Val", 190, false, DatabasePartidos.PODE, DatabaseEstados.ESPIRITO_SANTO);

    // Goiás (GO) - Senadores
    Legislador jorgeKajuru = new Legislador(Legislador.SENADOR, "Jorge Kajuru", 401, false, DatabasePartidos.PSB, DatabaseEstados.GOIAS);
    Legislador vanderlanCardoso = new Legislador(Legislador.SENADOR, "Vanderlan Cardoso", 560, false, DatabasePartidos.PSD, DatabaseEstados.GOIAS);
    Legislador wilderMorais = new Legislador(Legislador.SENADOR, "Wilder Morais", 224, true, DatabasePartidos.PL, DatabaseEstados.GOIAS);

    // Maranhão (MA) - Senadores
    Legislador anaPaulaLobato = new Legislador(Legislador.SENADOR, "Ana Paula Lobato", 121, false, DatabasePartidos.PDT, DatabaseEstados.MARANHAO);
    Legislador elizianeGama = new Legislador(Legislador.SENADOR, "Eliziane Gama", 561, false, DatabasePartidos.PSD, DatabaseEstados.MARANHAO);
    Legislador weverton = new Legislador(Legislador.SENADOR, "Weverton", 122, false, DatabasePartidos.PDT, DatabaseEstados.MARANHAO);

    // Minas Gerais (MG) - Senadores
    Legislador carlosViana = new Legislador(Legislador.SENADOR, "Carlos Viana", 191, false, DatabasePartidos.PODE, DatabaseEstados.MINAS_GERAIS);
    Legislador cleitinho = new Legislador(Legislador.SENADOR, "Cleitinho", 102, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.MINAS_GERAIS);
    Legislador rodrigoPacheco = new Legislador(Legislador.SENADOR, "Rodrigo Pacheco", 562, false, DatabasePartidos.PSD, DatabaseEstados.MINAS_GERAIS);

    // Mato Grosso do Sul (MS) - Senadores
    Legislador nelsinhoTrad = new Legislador(Legislador.SENADOR, "Nelsinho Trad", 563, false, DatabasePartidos.PSD, DatabaseEstados.MATO_GROSSO_DO_SUL);
    Legislador sorayaThronicke = new Legislador(Legislador.SENADOR, "Soraya Thronicke", 192, false, DatabasePartidos.PODE, DatabaseEstados.MATO_GROSSO_DO_SUL);
    Legislador terezacristina = new Legislador(Legislador.SENADOR, "Tereza Cristina", 110, true, DatabasePartidos.PP, DatabaseEstados.MATO_GROSSO_DO_SUL);

    // Mato Grosso (MT) - Senadores
    Legislador jaymeCampos = new Legislador(Legislador.SENADOR, "Jayme Campos", 442, false, DatabasePartidos.UNIAO, DatabaseEstados.MATO_GROSSO);
    Legislador margarethBuzetti = new Legislador(Legislador.SENADOR, "Margareth Buzetti", 564, false, DatabasePartidos.PSD, DatabaseEstados.MATO_GROSSO);
    Legislador wellingtonFagundes = new Legislador(Legislador.SENADOR, "Wellington Fagundes", 225, true, DatabasePartidos.PL, DatabaseEstados.MATO_GROSSO);

    // Pará (PA) - Senadores
    Legislador betoFaro = new Legislador(Legislador.SENADOR, "Beto Faro", 134, true, DatabasePartidos.PT, DatabaseEstados.PARA);
    Legislador jaderBarbalho = new Legislador(Legislador.SENADOR, "Jader Barbalho", 153, false, DatabasePartidos.MDB, DatabaseEstados.PARA);
    Legislador zequinhaMarinho = new Legislador(Legislador.SENADOR, "Zequinha Marinho", 193, false, DatabasePartidos.PODE, DatabaseEstados.PARA);

    // Paraíba (PB) - Senadores
    Legislador efraimFilho = new Legislador(Legislador.SENADOR, "Efraim Filho", 443, true, DatabasePartidos.UNIAO, DatabaseEstados.PARAIBA);
    Legislador venezianoVital = new Legislador(Legislador.SENADOR, "Veneziano Vital do Rêgo", 154, false, DatabasePartidos.MDB, DatabaseEstados.PARAIBA);
    Legislador daniellaRibeiro = new Legislador(Legislador.SENADOR, "Daniella Ribeiro", 999, false, DatabasePartidos.SEM_PARTIDO, DatabaseEstados.PARAIBA);

    // Pernambuco (PE) - Senadores
    Legislador fernandoDueire = new Legislador(Legislador.SENADOR, "Fernando Dueire", 155, false, DatabasePartidos.MDB, DatabaseEstados.PERNAMBUCO);
    Legislador humbertoCosta = new Legislador(Legislador.SENADOR, "Humberto Costa", 135, false, DatabasePartidos.PT, DatabaseEstados.PERNAMBUCO);
    Legislador teresaLeitao = new Legislador(Legislador.SENADOR, "Teresa Leitão", 136, true, DatabasePartidos.PT, DatabaseEstados.PERNAMBUCO);

    // Piauí (PI) - Senadores
    Legislador ciroNogueira = new Legislador(Legislador.SENADOR, "Ciro Nogueira", 111, false, DatabasePartidos.PP, DatabaseEstados.PIAUI);
    Legislador jussaraLima = new Legislador(Legislador.SENADOR, "Jussara Lima", 565, false, DatabasePartidos.PSD, DatabaseEstados.PIAUI);
    Legislador marceloCastro = new Legislador(Legislador.SENADOR, "Marcelo Castro", 156, false, DatabasePartidos.MDB, DatabaseEstados.PIAUI);

    // Paraná (PR) - Senadores
    Legislador flavioArns = new Legislador(Legislador.SENADOR, "Flávio Arns", 402, false, DatabasePartidos.PSB, DatabaseEstados.PARANA);
    Legislador oriovistoGuimaraes = new Legislador(Legislador.SENADOR, "Oriovisto Guimarães", 451, false, DatabasePartidos.PSDB, DatabaseEstados.PARANA);
    Legislador sergioMoro = new Legislador(Legislador.SENADOR, "Sergio Moro", 444, true, DatabasePartidos.UNIAO, DatabaseEstados.PARANA);

    // Rio de Janeiro (RJ) - Senadores
    Legislador carlosPortinho = new Legislador(Legislador.SENADOR, "Carlos Portinho", 226, false, DatabasePartidos.PL, DatabaseEstados.RIO_DE_JANEIRO);
    Legislador flavioBolsonaro = new Legislador(Legislador.SENADOR, "Flávio Bolsonaro", 227, false, DatabasePartidos.PL, DatabaseEstados.RIO_DE_JANEIRO);
    Legislador romario = new Legislador(Legislador.SENADOR, "Romário", 228, true, DatabasePartidos.PL, DatabaseEstados.RIO_DE_JANEIRO);

    // Rio Grande do Norte (RN) - Senadores
    Legislador rogerioMarinho = new Legislador(Legislador.SENADOR, "Rogerio Marinho", 229, true, DatabasePartidos.PL, DatabaseEstados.RIO_GRANDE_DO_NORTE);
    Legislador styvensonValentim = new Legislador(Legislador.SENADOR, "Styvenson Valentim", 452, false, DatabasePartidos.PSDB, DatabaseEstados.RIO_GRANDE_DO_NORTE);
    Legislador zenaideMaia = new Legislador(Legislador.SENADOR, "Zenaide Maia", 566, false, DatabasePartidos.PSD, DatabaseEstados.RIO_GRANDE_DO_NORTE);

    // Rondônia (RO) - Senadores
    Legislador confucioMoura = new Legislador(Legislador.SENADOR, "Confúcio Moura", 157, false, DatabasePartidos.MDB, DatabaseEstados.RONDONIA);
    Legislador jaimeBagattoli = new Legislador(Legislador.SENADOR, "Jaime Bagattoli", 230, true, DatabasePartidos.PL, DatabaseEstados.RONDONIA);
    Legislador marcosRogerio = new Legislador(Legislador.SENADOR, "Marcos Rogério", 231, false, DatabasePartidos.PL, DatabaseEstados.RONDONIA);

    // Roraima (RR) - Senadores
    Legislador chicoRodrigues = new Legislador(Legislador.SENADOR, "Chico Rodrigues", 403, false, DatabasePartidos.PSB, DatabaseEstados.RORAIMA);
    Legislador drHiran = new Legislador(Legislador.SENADOR, "Dr. Hiran", 112, true, DatabasePartidos.PP, DatabaseEstados.RORAIMA);
    Legislador meciasDeJesus = new Legislador(Legislador.SENADOR, "Mecias de Jesus", 103, false, DatabasePartidos.REPUBLICANOS, DatabaseEstados.RORAIMA);

    // Rio Grande do Sul (RS) - Senadores
    Legislador hamiltonMourao = new Legislador(Legislador.SENADOR, "Hamilton Mourão", 104, true, DatabasePartidos.REPUBLICANOS, DatabaseEstados.RIO_GRANDE_DO_SUL);
    Legislador luisCarlosHeinze = new Legislador(Legislador.SENADOR, "Luis Carlos Heinze", 113, false, DatabasePartidos.PP, DatabaseEstados.RIO_GRANDE_DO_SUL);
    Legislador pauloPaim = new Legislador(Legislador.SENADOR, "Paulo Paim", 137, false, DatabasePartidos.PT, DatabaseEstados.RIO_GRANDE_DO_SUL);

    // Santa Catarina (SC) - Senadores
    Legislador esperidiaoAmin = new Legislador(Legislador.SENADOR, "Esperidião Amin", 114, false, DatabasePartidos.PP, DatabaseEstados.SANTA_CATARINA);
    Legislador iveteDaSilveira = new Legislador(Legislador.SENADOR, "Ivete da Silveira", 158, false, DatabasePartidos.MDB, DatabaseEstados.SANTA_CATARINA);
    Legislador jorgeSeif = new Legislador(Legislador.SENADOR, "Jorge Seif", 232, true, DatabasePartidos.PL, DatabaseEstados.SANTA_CATARINA);

    // Sergipe (SE) - Senadores
    Legislador alessandroVieira = new Legislador(Legislador.SENADOR, "Alessandro Vieira", 159, false, DatabasePartidos.MDB, DatabaseEstados.SERGIPE);
    Legislador laercioOliveira = new Legislador(Legislador.SENADOR, "Laércio Oliveira", 115, true, DatabasePartidos.PP, DatabaseEstados.SERGIPE);
    Legislador rogerioCarvalho = new Legislador(Legislador.SENADOR, "Rogério Carvalho", 138, false, DatabasePartidos.PT, DatabaseEstados.SERGIPE);

    // São Paulo (SP) - Senadores
    Legislador astronautaMarcosPontes = new Legislador(Legislador.SENADOR, "Astronauta Marcos Pontes", 233, true, DatabasePartidos.PL, DatabaseEstados.SAO_PAULO);
    Legislador giordano = new Legislador(Legislador.SENADOR, "Giordano", 160, false, DatabasePartidos.MDB, DatabaseEstados.SAO_PAULO);
    Legislador maraGabrilli = new Legislador(Legislador.SENADOR, "Mara Gabrilli", 567, false, DatabasePartidos.PSD, DatabaseEstados.SAO_PAULO);

    // Tocantins (TO) - Senadores
    Legislador eduardoGomes = new Legislador(Legislador.SENADOR, "Eduardo Gomes", 234, false, DatabasePartidos.PL, DatabaseEstados.TOCANTINS);
    Legislador iraja = new Legislador(Legislador.SENADOR, "Irajá", 568, false, DatabasePartidos.PSD, DatabaseEstados.TOCANTINS);
    Legislador professoraDorinha = new Legislador(Legislador.SENADOR, "Professora Dorinha Seabra", 445, true, DatabasePartidos.UNIAO, DatabaseEstados.TOCANTINS);

    public ArrayList<Legislador> listAllSenadores(){
        ArrayList senadores = new ArrayList<>();
        for (Field field : this.getClass().getDeclaredFields()) {
            try {
                Legislador legislador = (Legislador) field.get(this);
                senadores.add(legislador);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return senadores;
    }
}
